package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import controller.*;
import model.*;
import util.CSVReader;
import util.Constants;
import view.MainFrame;

import javax.swing.*;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Application entry point.
 */
public class Main {

    public static void main(String[] args) {

        // Initialise controllers
        PatientController patientController = new PatientController();
        ClinicianController clinicianController = new ClinicianController();
        AppointmentController appointmentController = new AppointmentController();
        PrescriptionController prescriptionController = new PrescriptionController();
        ReferralController referralController = new ReferralController();

        // Load data from CSV files
        List<Patient> patients = CSVReader.loadPatients(Constants.PATIENTS_FILE);
        for (Patient p : patients) {
            patientController.addPatient(p);
        }

        List<Clinician> clinicians = CSVReader.loadClinicians(Constants.CLINICIANS_FILE);
        for (Clinician c : clinicians) {
            clinicianController.addClinician(c);
        }

        List<Appointment> appointments = CSVReader.loadAppointments(Constants.APPOINTMENTS_FILE);
        for (Appointment a : appointments) {
            appointmentController.bookAppointment(a);
        }

        List<Prescription> prescriptions = CSVReader.loadPrescriptions(Constants.PRESCRIPTIONS_FILE);
        for (Prescription p : prescriptions) {
            prescriptionController.issuePrescription(p);
        }

        List<Referral> referrals = CSVReader.loadReferrals(Constants.REFERRALS_FILE);
        for (Referral r : referrals) {
            referralController.createReferral(r);
        }

        // Launch GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame(
                    patientController,
                    clinicianController,
                    appointmentController,
                    prescriptionController,
                    referralController
            );
            frame.setVisible(true);
        });
    }
}
