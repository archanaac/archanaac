/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Appointment;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Handles appointment booking and management.
 */
public class AppointmentController {

    private List<Appointment> appointments;

    public AppointmentController() {
        appointments = new ArrayList<>();
    }

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    public Appointment findAppointmentById(String appointmentId) {
        for (Appointment a : appointments) {
            if (a.getAppointmentId().equals(appointmentId)) {
                return a;
            }
        }
        return null;
    }

    public void cancelAppointment(String appointmentId) {
        Appointment appointment = findAppointmentById(appointmentId);
        if (appointment != null) {
            appointment.cancel();
        }
    }
}
