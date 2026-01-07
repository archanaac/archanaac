/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Handles patient-related operations.
 */
public class PatientController {

    private List<Patient> patients;

    public PatientController() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient findPatientById(String patientId) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(patientId)) {
                return p;
            }
        }
        return null;
    }

    public void removePatient(String patientId) {
        patients.removeIf(p -> p.getPatientId().equals(patientId));
    }
}
