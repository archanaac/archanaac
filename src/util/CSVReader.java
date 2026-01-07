/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Archana
 * SRN: 22076155
 *
 * Utility class for reading CSV files and converting them into model objects.
 */
public class CSVReader {

    private static String[] split(String line) {
        return line.split(",", -1);
    }

    public static List<Patient> loadPatients(String filePath) {
        List<Patient> patients = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = split(line);
                patients.add(new Patient(
                        d[0], d[1], d[2], d[3], d[4], d[5],
                        d[6], d[7], d[8], d[9],
                        d[10], d[11], d[12], d[13]
                ));
            }
        } catch (IOException e) {
            System.err.println("Error loading patients: " + e.getMessage());
        }
        return patients;
    }

    public static List<Clinician> loadClinicians(String filePath) {
        List<Clinician> clinicians = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = split(line);
                clinicians.add(new Clinician(
                        d[0], d[1], d[2], d[3], d[4], d[5],
                        d[6], d[7], d[8], d[9],
                        d[10], d[11]
                ));
            }
        } catch (IOException e) {
            System.err.println("Error loading clinicians: " + e.getMessage());
        }
        return clinicians;
    }

    public static List<Appointment> loadAppointments(String filePath) {
        List<Appointment> appointments = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = split(line);
                appointments.add(new Appointment(
                        d[0], d[1], d[2], d[3], d[4], d[5],
                        Integer.parseInt(d[6]), d[7], d[8],
                        d[9], d[10], d[11], d[12]
                ));
            }
        } catch (IOException e) {
            System.err.println("Error loading appointments: " + e.getMessage());
        }
        return appointments;
    }

    public static List<Prescription> loadPrescriptions(String filePath) {
        List<Prescription> prescriptions = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = split(line);
                prescriptions.add(new Prescription(
                        d[0], d[1], d[2], d[3], d[4],
                        d[5], d[6], d[7],
                        Integer.parseInt(d[8]), d[9], d[10],
                        d[11], d[12], d[13], d[14]
                ));
            }
        } catch (IOException e) {
            System.err.println("Error loading prescriptions: " + e.getMessage());
        }
        return prescriptions;
    }

    public static List<Referral> loadReferrals(String filePath) {
        List<Referral> referrals = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = split(line);
                referrals.add(new Referral(
                        d[0], d[1], d[2], d[3], d[4],
                        d[5], d[6], d[7],
                        d[8], d[9], d[10], d[11], d[12]
                ));
            }
        } catch (IOException e) {
            System.err.println("Error loading referrals: " + e.getMessage());
        }
        return referrals;
    }
}
