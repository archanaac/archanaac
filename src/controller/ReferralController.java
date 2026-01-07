/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Referral;
import model.ReferralManager;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Handles referral creation and processing using Singleton manager.
 */
public class ReferralController {

    private ReferralManager referralManager;

    public ReferralController() {
        referralManager = ReferralManager.getInstance();
    }

    public void createReferral(Referral referral) {
        referralManager.addReferral(referral);
    }

    public List<Referral> getAllReferrals() {
        return referralManager.getAllReferrals();
    }

    public String generateReferralContent(Referral referral) {
        return referral.generateReferralText();
    }
}
