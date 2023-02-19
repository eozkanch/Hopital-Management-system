package com.hms.Hospital.Management.System.domain;

import lombok.*;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table(name = "doctors")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "name_prefix")
    private NamePrefix namePrefix;

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    private Department department;

    @Column(name = "date_of_graduate")
    private Year dateOfGraduate;

    @Column(name = "date_of_start")
    private Year dateOfStart;



    public enum NamePrefix {
        PHD,MD,DR
    }

    public enum Department {
        PEDIATRICIAN,DERMATOGIST,CARDIOLOGISTS

    }
}