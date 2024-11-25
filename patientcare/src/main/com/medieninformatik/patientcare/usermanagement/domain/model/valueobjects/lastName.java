package com.medieninformatik.patientcare.usermanagement.domain.model.valueobjects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class lastName {
    private String lastName;

    public lastName(String firstName) { this.lastName = firstName; }
}

