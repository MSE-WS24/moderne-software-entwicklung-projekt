package com.medieninformatik.patientcare.appointmentmanagement.infrastructure.repositories;

import com.medieninformatik.patientcare.appointmentmanagement.domain.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long>{
}