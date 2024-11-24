package com.medieninformatik.patientcare.userManagement.infrastructure.controllers;

import com.medieninformatik.patientcare.userManagement.domain.model.Doctor;
import com.medieninformatik.patientcare.userManagement.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(path = "/doctors")
public class DoctorController {

private final DoctorService doctorService;

@Autowired
public DoctorController(DoctorService doctorService) {
	this.doctorService = doctorService;
}

@CrossOrigin
@GetMapping(path = "/{id}")
public Optional<Doctor> findDoctor(@PathVariable("id") Long id) {
	return doctorService.getDoctor(id);
}
}