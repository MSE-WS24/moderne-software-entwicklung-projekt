package com.medieninformatik.patientcare.usermanagement.domain.model;

import com.medieninformatik.patientcare.patientdatamanagement.domain.model.shared.Note;
import com.medieninformatik.patientcare.usermanagement.domain.model.shared.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Patient extends User {

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Note> notes;
@Id
private Long id;

// Default constructor
    public Patient() {
    }

// Constructor with parameters
public Patient(String firstName, String lastName)
{
	this.setFirstName(firstName);
	this.setLastName(lastName);
}

@Override
public String toString()
{
	return "Patient{" +
			"id=" + super.getId() +
			", firstName='" + super.getFirstName() + '\'' +
			", lastName='" + super.getLastName() + '\'' +
			'}';
}

public void setId(Long id)
{
	this.id = id;
}

public Long getId()
{
	return id;
}
}
