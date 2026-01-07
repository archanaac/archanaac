/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Prescription;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Handles prescription creation and management.
 */
public class PrescriptionController {

    private List<Prescription> prescriptions;

    public PrescriptionController() {
        prescriptions = new ArrayList<>();
    }

    public void issuePrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    public Prescription findPrescriptionById(String prescriptionId) {
        for (Prescription p : prescriptions) {
            if (p.getPrescriptionId().equals(prescriptionId)) {
                return p;
            }
        }
        return null;
    }
}
