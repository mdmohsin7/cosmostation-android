package wannabit.io.cosmostaion.network.res.neutron

data class ResProposalData(val proposals: List<ProposalData?>)


data class ProposalData(val id: String?, val proposal: Proposal?)

data class Proposal(
    val title: String?,
    val description: String?,
    val expiration: Expiration?,
    val status: String?,
    val threshold: Threshold?,
    val choices: List<Choice?>,
    val allow_revoting: Boolean
)

data class Expiration(val at_time: String?, val at_height: String?)
data class Threshold(val threshold_quorum: ThresholdQuorum?)
data class ThresholdQuorum(val threshold: Hold?, val quorum: Quorum?)
data class Hold(val percent: String?)
data class Quorum(val percent: String?)

data class Choice(val index: Int?, val option_type: String?, val description: String?)

data class Proposals(val contractAddress: String?, val proposals: ResProposalData?)