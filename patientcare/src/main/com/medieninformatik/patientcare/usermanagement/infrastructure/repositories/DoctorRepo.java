package com.medieninformatik.patientcare.usermanagement.infrastructure.repositories;

import com.medieninformatik.patientcare.usermanagement.domain.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long>{
}