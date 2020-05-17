package wannabit.io.cosmostaion.network.res;

import android.content.Context;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.math.RoundingMode;

import wannabit.io.cosmostaion.model.KavaCDP;
import wannabit.io.cosmostaion.model.type.Coin;
import wannabit.io.cosmostaion.utils.WDp;
import wannabit.io.cosmostaion.utils.WLog;
import wannabit.io.cosmostaion.utils.WUtil;

public class ResCdpOwnerStatus {

    @SerializedName("height")
    public String height;

    @SerializedName("result")
    public Result result;


    public class Result {

        @SerializedName("cdp")
        public KavaCDP cdp;

        @SerializedName("collateral_value")
        public Coin collateral_value;

        @SerializedName("collateralization_ratio")
        public String collateralization_ratio;

        public String getDenom() {
            return cdp.collateral.get(0).denom;
        }

        public String getPDenom() {
            return cdp.principal.get(0).denom;
        }

        public String getMarketId() {
            return cdp.collateral.get(0).denom + ":usd";
        }

        public String getDpMarketId() {
            return cdp.collateral.get(0).denom.toUpperCase() + " : usdx".toUpperCase() ;
        }

        public String getImagePath() {
            return cdp.collateral.get(0).denom + "usd.png";
        }

        public BigDecimal getCollateralAmount() {
            try {
                return new BigDecimal(cdp.collateral.get(0).amount);
            } catch (Exception e) {}
            return BigDecimal.ZERO;
        }

        public BigDecimal getPrincipalAmount() {
            try {
                return new BigDecimal(cdp.principal.get(0).amount);
            } catch (Exception e) { }
            return BigDecimal.ZERO;
        }

        public BigDecimal getAccumulatedFees() {
            try {
                return new BigDecimal(cdp.accumulated_fees.get(0).amount);
            } catch (Exception e) { }
            return BigDecimal.ZERO;
        }

        public BigDecimal getRawDebtAmount() {
            return getPrincipalAmount().add(getAccumulatedFees());
        }

        public BigDecimal getEstimatedTotalFee(Context c, ResCdpParam.KavaCollateralParam cParam) {
            BigDecimal hiddenFeeValue = WDp.getCdpHiddenFee(c, getRawDebtAmount(), cParam, cdp);
            return  getAccumulatedFees().add(hiddenFeeValue);
        }

        public BigDecimal getEstimatedTotalDebt(Context c, ResCdpParam.KavaCollateralParam cParam) {
            BigDecimal hiddenFeeValue = WDp.getCdpHiddenFee(c, getRawDebtAmount(), cParam, cdp);
            return  getRawDebtAmount().add(hiddenFeeValue);
        }

        public BigDecimal getLiquidationPrice(Context c, ResCdpParam.KavaCollateralParam cParam) {
            int denomCDecimal = WUtil.getKavaCoinDecimal(getDenom());
            int denomPDecimal = WUtil.getKavaCoinDecimal(getPDenom());
            BigDecimal collateralAmount = getCollateralAmount().movePointLeft(denomCDecimal);
            BigDecimal estimatedDebtAmount = getEstimatedTotalDebt(c, cParam).multiply(new BigDecimal(cParam.liquidation_ratio)).movePointLeft(denomPDecimal);
            return estimatedDebtAmount.divide(collateralAmount, denomPDecimal, BigDecimal.ROUND_DOWN);
        }

        public BigDecimal getWithdrawableAmount(Context c, ResCdpParam.KavaCollateralParam cParam, BigDecimal price, BigDecimal selfDeposit) {
            int denomCDecimal = WUtil.getKavaCoinDecimal(getDenom());
            int denomPDecimal = WUtil.getKavaCoinDecimal(getPDenom());
            BigDecimal cValue = new BigDecimal(collateral_value.amount);
            BigDecimal minCValue = getEstimatedTotalDebt(c, cParam).multiply(new BigDecimal(cParam.liquidation_ratio)).divide(new BigDecimal("0.95"), 0, BigDecimal.ROUND_DOWN);
            BigDecimal maxWithdrawableValue = cValue.subtract(minCValue);
//            WLog.w("maxWithdrawableValue " + maxWithdrawableValue);
            BigDecimal maxWithdrawableAmount = maxWithdrawableValue.movePointLeft(denomPDecimal - denomCDecimal).divide(price, 0, RoundingMode.DOWN);
//            WLog.w("maxWithdrawableAmount " + maxWithdrawableAmount);

            if (maxWithdrawableAmount.compareTo(selfDeposit) > 0 ) {
                maxWithdrawableAmount =  selfDeposit;
            }
            if (maxWithdrawableAmount.compareTo(BigDecimal.ZERO) <= 0) {
                maxWithdrawableAmount = BigDecimal.ZERO;
            }
            return maxWithdrawableAmount;

        }

        public BigDecimal getMoreLoanableAmount(Context c, ResCdpParam.KavaCollateralParam cParam) {
            BigDecimal maxDebtValue = new BigDecimal(collateral_value.amount).divide(new BigDecimal(cParam.liquidation_ratio), 0, RoundingMode.DOWN);
//            WLog.w("maxDebtValue " + maxDebtValue);
            maxDebtValue = maxDebtValue.multiply(new BigDecimal("0.95")).setScale(0, RoundingMode.DOWN);
//            WLog.w("maxDebtValue padding " + maxDebtValue);

            maxDebtValue = maxDebtValue.subtract(getEstimatedTotalDebt(c, cParam));
            if (maxDebtValue.compareTo(BigDecimal.ZERO) <= 0) {
                maxDebtValue = BigDecimal.ZERO;
            }
            return maxDebtValue;

        }
    }


}