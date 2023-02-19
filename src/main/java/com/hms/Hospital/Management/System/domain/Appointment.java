package com.hms.Hospital.Management.System.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "doctor_id")
    private String doctorId;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "appointment_date")
    private String date;

    @Column(name = "appointment_hour")
    private Integer hour;

    @Column(name = "appointment_minute")
    private Integer minute;

    @Column(name = "notes")
    private String notes;
}
