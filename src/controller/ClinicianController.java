/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Clinician;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Handles clinician-related operations.
 */
public class ClinicianController {

    private List<Clinician> clinicians;

    public ClinicianController() {
        clinicians = new ArrayList<>();
    }

    public void addClinician(Clinician clinician) {
        clinicians.add(clinician);
    }

    public List<Clinician> getAllClinicians() {
        return clinicians;
    }

    public Clinician findClinicianById(String clinicianId) {
        for (Clinician c : clinicians) {
            if (c.getClinicianId().equals(clinicianId)) {
                return c;
            }
        }
        return null;
    }
}
