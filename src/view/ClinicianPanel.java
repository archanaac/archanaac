/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ClinicianController;
import model.Clinician;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Author: Archana
 * SRN: 22076155
 */
public class ClinicianPanel extends JPanel {

    private DefaultTableModel tableModel;

    public ClinicianPanel(ClinicianController controller) {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"Clinician ID", "Name", "Specialty"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Clinician");
        addButton.addActionListener(e -> {
            Clinician c = new Clinician("CNEW", "Test", "Doctor",
                    "Dr", "General Practice", "0000",
                    "0000000000", "doc@test.com",
                    "S001", "GP Surgery",
                    "Full-time", "01-01-2025");

            controller.addClinician(c);
            tableModel.addRow(new Object[]{
                    c.getClinicianId(), c.getFullName(), c.getSpecialty()
            });
        });

        add(addButton, BorderLayout.SOUTH);
    }
}
