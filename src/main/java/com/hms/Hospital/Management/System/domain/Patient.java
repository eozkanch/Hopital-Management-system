package com.hms.Hospital.Management.System.domain;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Patient {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "date_of_birth", nullable = false)
    private Integer dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name = "city", nullable = false)
    private City city;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "health_insurance", nullable = false)
    private boolean healthInsurance;

    public boolean getHealthInsurance() {
        return healthInsurance;
    }


    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public enum City {
        ISTANBUL, ANKARA, IZMIR, BURSA, ADANA, ANTALYA
    }
}
