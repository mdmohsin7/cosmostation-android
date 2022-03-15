package wannabit.io.cosmostaion.cosmos;

import static wannabit.io.cosmostaion.base.BaseChain.KAVA_MAIN;
import static wannabit.io.cosmostaion.base.BaseChain.OKEX_MAIN;
import static wannabit.io.cosmostaion.base.BaseConstant.BINANCE_MAIN_BNB_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.BINANCE_MAIN_BTCB_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.BINANCE_MAIN_BUSD_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.BINANCE_MAIN_XRPB_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.KAVA_MAIN_BNB_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.KAVA_MAIN_BTCB_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.KAVA_MAIN_BUSD_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.KAVA_MAIN_XRPB_DEPUTY;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_BNB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_BTCB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_BUSD;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_XRPB;
import static wannabit.io.cosmostaion.utils.WUtil.integerToBytes;

import android.util.Base64;

import com.binance.dex.api.client.domain.broadcast.HtltReq;
import com.binance.dex.api.client.encoding.message.Token;

import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Sign;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;

import wannabit.io.cosmostaion.base.BaseChain;
import wannabit.io.cosmostaion.base.BaseConstant;
import wannabit.io.cosmostaion.crypto.Sha256;
import wannabit.io.cosmostaion.dao.Account;
import wannabit.io.cosmostaion.model.StdSignMsg;
import wannabit.io.cosmostaion.model.StdTx;
import wannabit.io.cosmostaion.model.type.Coin;
import wannabit.io.cosmostaion.model.type.Fee;
import wannabit.io.cosmostaion.model.type.Msg;
import wannabit.io.cosmostaion.model.type.Pub_key;
import wannabit.io.cosmostaion.model.type.Signature;
import wannabit.io.cosmostaion.network.req.ReqBroadCast;
import wannabit.io.cosmostaion.utils.WKey;
import wannabit.io.cosmostaion.utils.WLog;
import wannabit.io.cosmostaion.utils.WUtil;



public class MsgGenerator {

    public static Msg genTransferMsg(String fromAddr, String toAddr, ArrayList<Coin> coins, BaseChain chain) {
        Msg         result      = new Msg();
        Msg.Value   value       = new Msg.Value();
        if (chain.equals(OKEX_MAIN)) {
            try {
                value.from_address = WKey.convertAddressEthToOkex(fromAddr);
                value.to_address = WKey.convertAddressEthToOkex(toAddr);
                value.amount = coins;

                result.type = BaseConstant.OK_MSG_TYPE_TRANSFER;
                result.value = value;
            } catch (Exception e) { e.printStackTrace(); }

        } else {
            value.from_address = fromAddr;
            value.to_address = toAddr;
            value.amount = coins;

            result.type = BaseConstant.COSMOS_MSG_TYPE_TRANSFER2;
            result.value = value;
        }
        return result;
    }

    public static Msg genRefundAtomicSwap(String from, String swapId, BaseChain chain) {
        Msg result  = new Msg();
        Msg.Value value = new Msg.Value();
        if (chain.equals(KAVA_MAIN)) {
            value.from = from;
            value.swap_id = swapId.toUpperCase();
            result.type = BaseConstant.KAVA_MSG_TYPE_BEP3_REFUND_SWAP;
            result.value = value;

        }
        return result;
    }

    public static HtltReq getBnbHtlcCreateMsg(BaseChain fromChain, BaseChain toChain, Account fromAccount, Account toAccount, ArrayList<Coin> sendCoins, long timestamp, byte[] originData) {
        HtltReq htltReq = new HtltReq();
        Coin toSendCoin = sendCoins.get(0);
        if (fromChain.equals(BaseChain.BNB_MAIN)) {
            if (toChain.equals(KAVA_MAIN)) {
                if (sendCoins.get(0).denom.equals(TOKEN_HTLC_BINANCE_BNB)) {
                    htltReq.setRecipient(BINANCE_MAIN_BNB_DEPUTY);
                    htltReq.setSenderOtherChain(KAVA_MAIN_BNB_DEPUTY);

                } else if (sendCoins.get(0).denom.equals(TOKEN_HTLC_BINANCE_BTCB)) {
                    htltReq.setRecipient(BINANCE_MAIN_BTCB_DEPUTY);
                    htltReq.setSenderOtherChain(KAVA_MAIN_BTCB_DEPUTY);

                } else if (sendCoins.get(0).denom.equals(TOKEN_HTLC_BINANCE_XRPB)) {
                    htltReq.setRecipient(BINANCE_MAIN_XRPB_DEPUTY);
                    htltReq.setSenderOtherChain(KAVA_MAIN_XRPB_DEPUTY);

                } else if (sendCoins.get(0).denom.equals(TOKEN_HTLC_BINANCE_BUSD)) {
                    htltReq.setRecipient(BINANCE_MAIN_BUSD_DEPUTY);
                    htltReq.setSenderOtherChain(KAVA_MAIN_BUSD_DEPUTY);

                }

                htltReq.setRecipientOtherChain(toAccount.address);
                htltReq.setTimestamp(timestamp);
                htltReq.setRandomNumberHash(Sha256.getSha256Digest().digest(originData));
                Token token = new Token();
                token.setDenom(toSendCoin.denom);
                BigDecimal sendAmount = new BigDecimal(toSendCoin.amount).movePointRight(8);
                token.setAmount(sendAmount.longValue());
                htltReq.setOutAmount(Collections.singletonList(token));
                htltReq.setExpectedIncome(sendAmount.toPlainString() + ":" + toSendCoin.denom);
                htltReq.setHeightSpan(407547);
                htltReq.setCrossChain(true);

            }

        }

        return htltReq;
    }

    public static Msg genClaimHardLiquidityProviderMsg(String sender, String multiplierName) {
        Msg result  = new Msg();
        Msg.Value value = new Msg.Value();
        value.sender = sender;
        value.multiplier_name = multiplierName;
        result.type = BaseConstant.KAVA_MSG_TYPE_CLAIM_HARD_INCENTIVE;
        result.value = value;
        return result;
    }

    public static Msg genOkDeposit(String delegator, Coin coin, BaseChain chain) {
        Msg result  = new Msg();
        Msg.Value value = new Msg.Value();
        if (chain.equals(OKEX_MAIN)) {
            value.delegator_address = delegator;
            value.quantity = coin;

            result.type = BaseConstant.OK_MSG_TYPE_DEPOSIT;
            result.value = value;
        }
        return result;
    }

    public static Msg genOkWithdraw(String delegator, Coin coin, BaseChain chain) {
        Msg result  = new Msg();
        Msg.Value value = new Msg.Value();
        if (chain.equals(OKEX_MAIN)) {
            value.delegator_address = delegator;
            value.quantity = coin;

            result.type = BaseConstant.OK_MSG_TYPE_WITHDRAW;
            result.value = value;
        }
        return result;
    }

    public static Msg genOkVote(String delegator, ArrayList<String> toVals, BaseChain chain) {
        Msg result  = new Msg();
        Msg.Value value = new Msg.Value();
        if (chain.equals(OKEX_MAIN)) {
            value.delegator_address = delegator;
            value.validator_addresses = toVals;

            result.type = BaseConstant.OK_MSG_TYPE_DIRECT_VOTE;
            result.value = value;
        }
        return result;

    }

    public static StdTx genStakeSignedTransferTx(ArrayList<Msg> msgs, Fee fee, String memo, ArrayList<Signature> signatures) {
        StdTx result = new StdTx();
        StdTx.Value value = new StdTx.Value();

        value.msg = msgs;
        value.fee = fee;
        value.signatures = signatures;
        value.memo = memo;

        result.type = BaseConstant.COSMOS_AUTH_TYPE_STDTX;
        result.value = value;
        return result;
    }

    public static StdSignMsg genToSignMsg(String chainId, String accountNumber, String SequenceNumber, ArrayList<Msg> msgs, Fee fee, String memo) {
        StdSignMsg result = new StdSignMsg();
        result.chain_id = chainId;
        result.account_number = accountNumber;
        result.sequence = SequenceNumber;
        result.msgs = msgs;
        result.fee = fee;
        result.memo = memo;

        return result;
    }

    public static String getSignature(ECKey key, byte[] toSignByte) {
        MessageDigest digest = Sha256.getSha256Digest();
        byte[] toSignHash = digest.digest(toSignByte);
        ECKey.ECDSASignature Signature = key.sign(Sha256Hash.wrap(toSignHash));
        byte[] sigData = new byte[64];
        System.arraycopy(integerToBytes(Signature.r, 32), 0, sigData, 0, 32);
        System.arraycopy(integerToBytes(Signature.s, 32), 0, sigData, 32, 32);
        String base64 = Base64.encodeToString(sigData, Base64.DEFAULT).replace("\n", "");
        return base64;
    }

    public static ReqBroadCast getBroadcaseReq(Account account, ArrayList<Msg> msgs, Fee fee, String memo, ECKey key, String chainId) {
        StdSignMsg tosign = genToSignMsg(
                chainId,
                ""+account.accountNumber,
                ""+account.sequenceNumber,
                msgs,
                fee,
                memo);
//        WLog.w("Tendermint tosign " + WUtil.prettyPrinter(tosign));

        String signatureTx = MsgGenerator.getSignature(key, tosign.getToSignByte());
//        WLog.w("Tendermint signatureTx " + signatureTx);

        Signature signature = new Signature();
        Pub_key pubKey = new Pub_key();
        pubKey.type = BaseConstant.COSMOS_KEY_TYPE_PUBLIC;

        pubKey.value = WKey.getPubKeyValue(key);
        signature.pub_key = pubKey;
        signature.signature = signatureTx;
        signature.account_number = ""+account.accountNumber;
        signature.sequence = ""+account.sequenceNumber;

        ArrayList<Signature> signatures = new ArrayList<>();
        signatures.add(signature);

        StdTx signedTx = MsgGenerator.genStakeSignedTransferTx(msgs, fee, memo, signatures);
        WLog.w("signedTx : " +  WUtil.prettyPrinter(signedTx));

        ReqBroadCast reqBroadCast = new ReqBroadCast();
        reqBroadCast.returns = "sync";
        reqBroadCast.tx = signedTx.value;

        WLog.w("ReqBroadCast : " +  WUtil.prettyPrinter(reqBroadCast));


        return reqBroadCast;
    }

    public static ReqBroadCast getOKexBroadcaseReq(Account account, ArrayList<Msg> msgs, Fee fee, String memo, ECKey key, String chainId) {
        if (account.customPath == 0) {
            //using Tendermint type sig
            return getBroadcaseReq(account, msgs, fee, memo, key, chainId);
        } else {
            //using Ethermint type sig
            StdSignMsg tosign = genToSignMsg(chainId, ""+account.accountNumber, ""+account.sequenceNumber, msgs, fee, memo);
            String sig = MsgGenerator.getEthermintSignature(key, tosign.getToSignByte());

            Signature signature = new Signature();
            Pub_key pubKey = new Pub_key();
            pubKey.type = BaseConstant.ETHERMINT_KEY_TYPE_PUBLIC;

            String pubHex = WKey.generatePubKeyHexFromPriv(key.getPrivateKeyAsHex());
            pubKey.value = Strings.fromByteArray(org.bouncycastle.util.encoders.Base64.encode(Hex.decode(pubHex)));
            signature.pub_key = pubKey;
            signature.signature = sig;
            signature.account_number = ""+account.accountNumber;
            signature.sequence = ""+account.sequenceNumber;

            ArrayList<Signature> signatures = new ArrayList<>();
            signatures.add(signature);

            StdTx signedTx = MsgGenerator.genStakeSignedTransferTx(msgs, fee, memo, signatures);
//            WLog.w("Ethermint signedTx : " +  WUtil.prettyPrinter(signedTx));

            ReqBroadCast reqBroadCast = new ReqBroadCast();
            reqBroadCast.returns = "sync";
            reqBroadCast.tx = signedTx.value;
//            WLog.w("Ethermint reqBroadCast : " +  WUtil.prettyPrinter(reqBroadCast));

            return reqBroadCast;
        }
    }


    public static String getEthermintSignature(ECKey key, byte[] toSignByte) {
        BigInteger privKey = new BigInteger(key.getPrivateKeyAsHex(), 16);
        Sign.SignatureData sig = Sign.signMessage(toSignByte, ECKeyPair.create(privKey));
        return toBase64(sig);
    }

    public static String toBase64(Sign.SignatureData sig) {
        byte[] sigData = new byte[64];  // 32 bytes for R + 32 bytes for S
        System.arraycopy(sig.getR(), 0, sigData, 0, 32);
        System.arraycopy(sig.getS(), 0, sigData, 32, 32);
        return new String(org.bouncycastle.util.encoders.Base64.encode(sigData), Charset.forName("UTF-8"));
    }
}
