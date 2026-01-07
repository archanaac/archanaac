/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PrescriptionController;
import model.Prescription;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Author: Archana
 * SRN: 22076155
 */
public class PrescriptionPanel extends JPanel {

    private DefaultTableModel tableModel;

    public PrescriptionPanel(PrescriptionController controller) {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"Prescription ID", "Medication", "Status"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton issueButton = new JButton("Issue Prescription");
        issueButton.addActionListener(e -> {
            Prescription p = new Prescription("RXNEW", "P001", "C001",
                    "A001", "01-02-2026",
                    "Paracetamol", "500mg", "Once daily",
                    5, "10 tablets", "After food",
                    "Local Pharmacy", "Issued",
                    "01-02-2026", "");

            controller.issuePrescription(p);
            tableModel.addRow(new Object[]{
                    p.getPrescriptionId(), p.getMedicationName(), "Issued"
            });
        });

        add(issueButton, BorderLayout.SOUTH);
    }
}
