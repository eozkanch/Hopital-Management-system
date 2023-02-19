package com.hms.Hospital.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository<Doctor> extends JpaRepository<Doctor, String> {

}
