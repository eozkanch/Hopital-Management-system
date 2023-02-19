package com.hms.Hospital.Management.System.dTO;
import com.hms.Hospital.Management.System.domain.Doctor;
import lombok.*;

import java.time.Year;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorDTO {

    private String id;

    private String name;

    private Doctor.NamePrefix namePrefix;

    private Doctor.Department department;

    private Year dateOfGraduate;

    private Year dateOfStart;
}
