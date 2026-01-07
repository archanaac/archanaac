/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Centralised file paths and constants.
 */
public class Constants {

    public static final String DATA_FOLDER = "data/";

    public static final String PATIENTS_FILE = DATA_FOLDER + "patients.csv";
    public static final String CLINICIANS_FILE = DATA_FOLDER + "clinicians.csv";
    public static final String FACILITIES_FILE = DATA_FOLDER + "facilities.csv";
    public static final String APPOINTMENTS_FILE = DATA_FOLDER + "appointments.csv";
    public static final String PRESCRIPTIONS_FILE = DATA_FOLDER + "prescriptions.csv";
    public static final String REFERRALS_FILE = DATA_FOLDER + "referrals.csv";
    public static final String STAFF_FILE = DATA_FOLDER + "staff.csv";

    private Constants() {
        // Prevent instantiation
    }
}
