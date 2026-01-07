/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PatientController;
import model.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Author: Archana
 * SRN: 22076155
 */
public class PatientPanel extends JPanel {

    private DefaultTableModel tableModel;

    public PatientPanel(PatientController controller) {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"Patient ID", "Name", "GP Surgery"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Patient");
        addButton.addActionListener(e -> {
            Patient p = new Patient("PNEW", "New", "Patient",
                    "01-01-2000", "0000000000", "F",
                    "0000000000", "email@test.com",
                    "Address", "POST",
                    "Contact", "0000000000",
                    "01-01-2025", "S001");

            controller.addPatient(p);
            tableModel.addRow(new Object[]{
                    p.getPatientId(), p.getFullName(), p.getGpSurgeryId()
            });
        });

        add(addButton, BorderLayout.SOUTH);
    }
}
