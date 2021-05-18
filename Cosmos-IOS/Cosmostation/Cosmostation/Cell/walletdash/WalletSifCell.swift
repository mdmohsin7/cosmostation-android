//
//  WalletSifCell.swift
//  Cosmostation
//
//  Created by 정용주 on 2021/04/20.
//  Copyright © 2021 wannabit. All rights reserved.
//

import UIKit

class WalletSifCell: UITableViewCell {
    @IBOutlet weak var cardRoot: CardView!
    @IBOutlet weak var totalAmount: UILabel!
    @IBOutlet weak var totalValue: UILabel!
    @IBOutlet weak var availableAmount: UILabel!
    @IBOutlet weak var delegatedAmount: UILabel!
    @IBOutlet weak var unbondingAmount: UILabel!
    @IBOutlet weak var rewardAmount: UILabel!
    @IBOutlet weak var vestingAmount: UILabel!
    @IBOutlet weak var vestingLayer: UIView!

    override func awakeFromNib() {
        super.awakeFromNib()
        self.selectionStyle = .none
        availableAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        delegatedAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        rewardAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        unbondingAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        vestingAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
    }
    
    var actionDelegate: (() -> Void)? = nil
    var actionVote: (() -> Void)? = nil
    
    @IBAction func onClickDelegate(_ sender: Any) {
        actionDelegate?()
    }
    @IBAction func onClickVote(_ sender: Any) {
        actionVote?()
    }
    
    override func prepareForReuse() {
        vestingLayer.isHidden = true
    }
    
    func updateView(_ account: Account?, _ chainType: ChainType?) {
        let available = BaseData.instance.availableAmount(SIF_MAIN_DENOM)
        let vesting = BaseData.instance.lockedAmount(SIF_MAIN_DENOM)
        let delegated = BaseData.instance.delegatedSumAmount()
        let unbonding = BaseData.instance.unbondingSumAmount()
        let reward = BaseData.instance.rewardAmount(SIF_MAIN_DENOM)
        let total = available.adding(vesting).adding(delegated).adding(unbonding).adding(reward)
        
        totalAmount.attributedText = WUtils.displayAmount2(total.stringValue, totalAmount.font, 18, 6)
        availableAmount.attributedText = WUtils.displayAmount2(available.stringValue, availableAmount.font, 18, 6)
        delegatedAmount.attributedText = WUtils.displayAmount2(delegated.stringValue, delegatedAmount.font, 18, 6)
        unbondingAmount.attributedText = WUtils.displayAmount2(unbonding.stringValue, unbondingAmount.font, 18, 6)
        rewardAmount.attributedText = WUtils.displayAmount2(reward.stringValue, rewardAmount.font, 18, 6)
        totalValue.attributedText = WUtils.dpUserCurrencyValue(SIF_MAIN_DENOM, total, 18, totalValue.font)
        
        if (vesting.compare(NSDecimalNumber.zero).rawValue > 0) {
            vestingLayer.isHidden = false
            vestingAmount.attributedText = WUtils.displayAmount2(vesting.stringValue, vestingAmount.font!, 18, 6)
        }
        BaseData.instance.updateLastTotal(account, total.multiplying(byPowerOf10: -18).stringValue)
    }
}
