package com.medieninformatik.patientcare.patientDataManagement.domain.model;

import com.medieninformatik.patientcare.userManagement.domain.model.Doctor;
import com.medieninformatik.patientcare.userManagement.domain.model.Patient;
import com.medieninformatik.patientcare.userManagement.domain.model.shared.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Treatment {

    private Patient patient;
    private Doctor doctor;
    private User creator;
    private Date date;
    private Diagnosis diagnosis;
    private String action;

    // Konstruktor
    public Treatment(Patient patient, Doctor doctor, User creator, Date date, Diagnosis diagnosis, String action) {
        this.patient = patient;
        this.doctor = doctor;
        this.creator = creator;
        this.date = date;
        this.diagnosis = diagnosis;
        this.action = action;
    }

    // Getter und Setter (optional, falls du sie benötigst)
    public Patient getPatient() {
        return this.patient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public User getCreator() {
        return this.creator;
    }

    public Date getDate() {
        return this.date;
    }

    public Diagnosis getDiagnosis() {
        return this.diagnosis;
    }

    public String getAction() {
        return this.action;
    }
}
