/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ReferralController;
import model.Referral;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Author: Archana
 * SRN: 22076155
 */
public class ReferralPanel extends JPanel {

    private DefaultTableModel tableModel;

    public ReferralPanel(ReferralController controller) {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"Urgency", "Reason", "Status"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton createButton = new JButton("Create Referral");
        createButton.addActionListener(e -> {
            Referral r = new Referral("C005", "S001", "H001",
                    "01-02-2026", "Urgent", "Chest pain",
                    "Patient experiencing severe chest pain",
                    "ECG", "New", "A001",
                    "Notes", "01-02-2026", "01-02-2026");

            controller.createReferral(r);
            tableModel.addRow(new Object[]{
                    "Urgent", "Chest pain", "New"
            });
        });

        add(createButton, BorderLayout.SOUTH);
    }
}
