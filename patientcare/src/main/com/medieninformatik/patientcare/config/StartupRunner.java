package com.medieninformatik.patientcare.config;

import com.medieninformatik.patientcare.appointmentmanagement.domain.model.Appointment;
import com.medieninformatik.patientcare.usermanagement.domain.model.Doctor;
import com.medieninformatik.patientcare.usermanagement.domain.model.Patient;
import com.medieninformatik.patientcare.appointmentmanagement.infrastructure.repositories.AppointmentRepo;
import com.medieninformatik.patientcare.usermanagement.infrastructure.repositories.DoctorRepo;
import com.medieninformatik.patientcare.usermanagement.infrastructure.repositories.PatientRepo;
import com.medieninformatik.patientcare.appointmentmanagement.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;


@Component
public class StartupRunner implements ApplicationRunner {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private AppointmentService appointmentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("running.........");

        Patient patient = new Patient("Hans", "Klaus");
        patientRepo.save(patient);
        System.out.println("patient saved: " + patient);
        System.out.println(patient.getLastName());

        Doctor doctor = new Doctor("Hallo", "Dr. House");
        doctorRepo.save(doctor);


        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startDateTime = LocalDateTime.of(2024, Month.NOVEMBER, 25, 12, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, Month.NOVEMBER, 25, 12, 15);

        Appointment appointment = appointmentService.createAppointmentSlot(doctor, doctor, startDateTime, endDateTime,
                now);
        appointmentService.scheduleAppointment(appointment, patient, Appointment.Type.OFFLINE);
    }


}
