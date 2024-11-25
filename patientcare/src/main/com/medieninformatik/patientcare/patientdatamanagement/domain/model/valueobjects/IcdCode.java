package com.medieninformatik.patientcare.patientdatamanagement.domain.model.valueobjects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IcdCode {
    private String code;

    public IcdCode (String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
         this.code = code;
    }
}


