package com.hms.Hospital.Management.System.service;

import com.hms.Hospital.Management.System.domain.Appointment;
import com.hms.Hospital.Management.System.exception.AppointmentNotFoundException;
import com.hms.Hospital.Management.System.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(Integer id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new AppointmentNotFoundException("Appointment not found with id " + id));
    }

    public Appointment updateAppointment(Integer id, Appointment appointment) {
        Appointment existingAppointment = getAppointmentById(id);
        existingAppointment.setDoctorId(appointment.getDoctorId());
        existingAppointment.setPatientId(appointment.getPatientId());
        existingAppointment.setDate(appointment.getDate());
        existingAppointment.setHour(appointment.getHour());
        existingAppointment.setMinute(appointment.getMinute());
        existingAppointment.setNotes(appointment.getNotes());
        return appointmentRepository.save(existingAppointment);
    }

    public void deleteAppointment(Integer id) {
        Appointment existingAppointment = getAppointmentById(id);
        appointmentRepository.delete(existingAppointment);
    }
}
