package com.hms.Hospital.Management.System.dTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    private Integer id;
    private String doctorId;
    private String patientId;
    private String date;
    private Integer hour;
    private Integer minute;
    private String notes;
}
