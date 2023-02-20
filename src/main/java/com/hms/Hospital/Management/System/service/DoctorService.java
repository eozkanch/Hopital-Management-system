package com.hms.Hospital.Management.System.service;

import com.hms.Hospital.Management.System.domain.Doctor;
import com.hms.Hospital.Management.System.exception.ResourceNotFoundException;
import com.hms.Hospital.Management.System.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {


    @Autowired
    private DoctorRepository<Doctor> doctorRepository;

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Doctor findById(String id) throws Throwable {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor", "id", id));
    }

    public Doctor save(Doctor doctor) {
        return (Doctor) doctorRepository.save(doctor);
    }

    public void deleteById(String id) {
        doctorRepository.deleteById(id);
    }

    public Doctor update(String id, Doctor doctor) throws Throwable {
        Doctor existingDoctor = findById(id);
        existingDoctor.setName(doctor.getName());
        existingDoctor.setNamePrefix(doctor.getNamePrefix());
        existingDoctor.setDepartment(doctor.getDepartment());
        existingDoctor.setDateOfGraduate(doctor.getDateOfGraduate());
        existingDoctor.setDateOfStart(doctor.getDateOfStart());
        return (Doctor) doctorRepository.save(existingDoctor);
    }
}