/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Author: Archana
 * SRN: 22076155
 */
public class Referral {

    private String referredToClinicianId;
    private String referringFacilityId;
    private String referredToFacilityId;
    private String referralDate;
    private String urgencyLevel;
    private String referralReason;
    private String clinicalSummary;
    private String requestedInvestigations;
    private String status;
    private String appointmentId;
    private String notes;
    private String createdDate;
    private String lastUpdated;

    public Referral(String referredToClinicianId, String referringFacilityId,
                    String referredToFacilityId, String referralDate,
                    String urgencyLevel, String referralReason,
                    String clinicalSummary, String requestedInvestigations,
                    String status, String appointmentId,
                    String notes, String createdDate, String lastUpdated) {
        this.referredToClinicianId = referredToClinicianId;
        this.referringFacilityId = referringFacilityId;
        this.referredToFacilityId = referredToFacilityId;
        this.referralDate = referralDate;
        this.urgencyLevel = urgencyLevel;
        this.referralReason = referralReason;
        this.clinicalSummary = clinicalSummary;
        this.requestedInvestigations = requestedInvestigations;
        this.status = status;
        this.appointmentId = appointmentId;
        this.notes = notes;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }

    public String generateReferralText() {
        return "Referral Reason: " + referralReason +
               "\nUrgency: " + urgencyLevel +
               "\nClinical Summary: " + clinicalSummary +
               "\nRequested Investigations: " + requestedInvestigations;
    }
}
