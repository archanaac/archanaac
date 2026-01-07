/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AppointmentController;
import model.Appointment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Author: Archana
 * SRN: 22076155
 */
public class AppointmentPanel extends JPanel {

    private DefaultTableModel tableModel;

    public AppointmentPanel(AppointmentController controller) {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(
                new String[]{"Appointment ID", "Date", "Status"}, 0);

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton bookButton = new JButton("Book Appointment");
        JButton cancelButton = new JButton("Cancel Appointment");

        bookButton.addActionListener(e -> {
            Appointment a = new Appointment("ANEW", "P001", "C001",
                    "S001", "01-02-2026", "10:00",
                    30, "Consultation", "Scheduled",
                    "Check-up", "", "01-02-2026", "01-02-2026");

            controller.bookAppointment(a);
            tableModel.addRow(new Object[]{
                    a.getAppointmentId(), "01-02-2026", a.getStatus()
            });
        });

        cancelButton.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) {
                String appointmentId = tableModel.getValueAt(row, 0).toString();
                controller.cancelAppointment(appointmentId);
                tableModel.setValueAt("Cancelled", row, 2);
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(bookButton);
        bottomPanel.add(cancelButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }
}
