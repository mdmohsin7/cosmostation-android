package wannabit.io.cosmostaion.base.chains;

import static wannabit.io.cosmostaion.base.BaseConstant.COINGECKO_URL;
import static wannabit.io.cosmostaion.base.BaseConstant.EXPLORER_BASE_URL;

import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.base.BaseChain;

public class Akash extends ChainConfig {

    public BaseChain baseChain() { return BaseChain.AKASH_MAIN; }
    public int chainImg() { return R.drawable.chain_akash; }
    public int chainInfoImg() { return R.drawable.infoicon_akash; }
    public int chainInfoTitle() { return R.string.str_front_guide_title_akash; }
    public int chainInfoMsg() { return R.string.str_front_guide_msg_akash; }
    public int chainColor() { return R.color.color_akash; }
    public int chainBgColor() { return R.color.colorTransBgAkash; }
    public int chainTabColor() { return R.color.color_tab_myvalidator_akash; }
    public String chainName() { return "akash"; }
    public String chainKoreanName() { return "아카시"; }
    public String chainIdPrefix() { return "akashnet-"; }

    public int mainDenomImg() { return R.drawable.token_akash; }
    public String mainDenom() { return "uakt"; }
    public String addressPrefix() { return "akash"; }

    public boolean dexSupport() { return false; }
    public boolean wcSupport() { return false; }
    public boolean authzSupport() { return true; }

    public String grpcUrl() { return "grpc-akash.cosmostation.io"; }

    public String explorerUrl() { return EXPLORER_BASE_URL + "akash/"; }
    public String homeInfoLink() { return  "https://akash.network"; }
    public String blogInfoLink() { return  "https://akash.network/blog"; }
    public String coingeckoLink() { return  COINGECKO_URL + "akash-network"; }
}
