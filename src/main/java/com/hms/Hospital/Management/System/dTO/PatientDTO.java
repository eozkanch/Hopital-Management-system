package com.hms.Hospital.Management.System.dTO;

import com.hms.Hospital.Management.System.domain.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDTO {

    private String id;
    private String name;
    private Patient.Gender gender;
    private Integer dateOfBirthYear;
    private Patient.City city;
    private String address;
    private Boolean healthInsurance;

}
