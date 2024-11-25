package com.medieninformatik.patientcare.usermanagement.services;

import com.medieninformatik.patientcare.usermanagement.domain.model.Patient;
import com.medieninformatik.patientcare.usermanagement.infrastructure.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepo patientRepo;

    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Optional<Patient> getPatient(Long personId) {
        return patientRepo.findById(personId);
    }
}
