/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.*;
import javax.swing.*;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Main application window.
 */
public class MainFrame extends JFrame {

    public MainFrame(PatientController patientController,
                     ClinicianController clinicianController,
                     AppointmentController appointmentController,
                     PrescriptionController prescriptionController,
                     ReferralController referralController) {

        setTitle("Healthcare Management System");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.add("Patients", new PatientPanel(patientController));
        tabbedPane.add("Clinicians", new ClinicianPanel(clinicianController));
        tabbedPane.add("Appointments", new AppointmentPanel(appointmentController));
        tabbedPane.add("Prescriptions", new PrescriptionPanel(prescriptionController));
        tabbedPane.add("Referrals", new ReferralPanel(referralController));
        tabbedPane.add("Admin", new AdminPanel());

        add(tabbedPane);
    }
}
