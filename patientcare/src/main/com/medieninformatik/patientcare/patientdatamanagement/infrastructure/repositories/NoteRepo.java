package com.medieninformatik.patientcare.patientdatamanagement.infrastructure.repositories;

import com.medieninformatik.patientcare.usermanagement.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<Patient, Long>{
}