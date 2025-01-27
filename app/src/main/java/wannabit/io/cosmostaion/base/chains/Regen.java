package wannabit.io.cosmostaion.base.chains;

import static wannabit.io.cosmostaion.base.BaseConstant.COINGECKO_URL;
import static wannabit.io.cosmostaion.base.BaseConstant.EXPLORER_BASE_URL;

import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.base.BaseChain;

public class Regen extends ChainConfig {

    public BaseChain baseChain() { return BaseChain.REGEN_MAIN; }
    public int chainImg() { return R.drawable.chain_regen; }
    public int chainInfoImg() { return R.drawable.infoicon_regen; }
    public int chainInfoTitle() { return R.string.str_front_guide_title_regen; }
    public int chainInfoMsg() { return R.string.str_front_guide_msg_regen; }
    public int chainColor() { return R.color.color_regen; }
    public int chainBgColor() { return R.color.colorTransBgRegen; }
    public int chainTabColor() { return R.color.color_tab_myvalidator_regen; }
    public String chainName() { return "regen"; }
    public String chainKoreanName() { return "리젠"; }
    public String chainIdPrefix() { return "regen-"; }

    public int mainDenomImg() { return R.drawable.token_regen; }
    public String mainDenom() { return "uregen"; }
    public String addressPrefix() { return "regen"; }

    public boolean dexSupport() { return false; }
    public boolean wcSupport() { return false; }
    public boolean authzSupport() { return true; }

    public String grpcUrl() { return "grpc-regen.cosmostation.io"; }

    public String explorerUrl() { return EXPLORER_BASE_URL + "regen/"; }
    public String homeInfoLink() { return  "https://www.regen.network"; }
    public String blogInfoLink() { return  "https://medium.com/regen-network"; }
    public String coingeckoLink() { return  COINGECKO_URL + "regen"; }
}
