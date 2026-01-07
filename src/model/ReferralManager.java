/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Singleton class responsible for managing referrals.
 */
public class ReferralManager {

    private static ReferralManager instance;
    private List<Referral> referralQueue;

    private ReferralManager() {
        referralQueue = new ArrayList<>();
    }

    public static ReferralManager getInstance() {
        if (instance == null) {
            instance = new ReferralManager();
        }
        return instance;
    }

    public void addReferral(Referral referral) {
        referralQueue.add(referral);
    }

    public List<Referral> getAllReferrals() {
        return referralQueue;
    }
}
