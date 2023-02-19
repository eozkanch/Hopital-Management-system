package com.hms.Hospital.Management.System.service;

import com.hms.Hospital.Management.System.domain.Patient;
import com.hms.Hospital.Management.System.exception.ResourceNotFoundException;
import com.hms.Hospital.Management.System.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(String id) throws Throwable {
        return (Patient) patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
    }

    public Patient createPatient(Patient patient) {
        return (Patient) patientRepository.save(patient);
    }

    public Patient updatePatient(String id, Patient patientDetails) throws Throwable {
        Patient patient = getPatientById(id);
        patient.setName(patientDetails.getName());
        patient.setGender(patientDetails.getGender());
        patient.setDateOfBirth(patientDetails.getDateOfBirth());
        patient.setCity(patientDetails.getCity());
        patient.setAddress(patientDetails.getAddress());
        patient.setHealthInsurance(patientDetails.getHealthInsurance());
        return (Patient) patientRepository.save(patient);
    }

    public void deletePatient(String id) throws Throwable {
        Patient patient = getPatientById(id);
        patientRepository.delete(patient);
    }
}