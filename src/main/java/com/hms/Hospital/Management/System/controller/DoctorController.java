package com.hms.Hospital.Management.System.controller;

import com.hms.Hospital.Management.System.domain.Doctor;
import com.hms.Hospital.Management.System.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {


    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> findAll() {
        return doctorService.findAll();
    }

    @GetMapping("/{id}")
    public Doctor findById(@PathVariable String id) throws Throwable {
        return doctorService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor save(@RequestBody Doctor doctor) {
        return doctorService.save(doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        doctorService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Doctor update(@PathVariable String id, @RequestBody Doctor doctor) throws Throwable {
        return doctorService.update(id, doctor);
    }
}