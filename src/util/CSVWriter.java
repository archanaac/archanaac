/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import model.Prescription;
import model.Referral;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Utility class for appending records to CSV files.
 */
public class CSVWriter {

    public static void appendPrescription(String filePath, Prescription p) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.append(String.join(",",
                    p.getPrescriptionId(),
                    "", "", "", "",   // IDs already known in system
                    p.getMedicationName(),
                    "", "", "0", "", "",
                    "", "Issued", "", ""
            ));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Error writing prescription: " + e.getMessage());
        }
    }

    public static void appendReferral(String filePath, Referral r) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.append(r.generateReferralText().replace("\n", " | "));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Error writing referral: " + e.getMessage());
        }
    }
}
