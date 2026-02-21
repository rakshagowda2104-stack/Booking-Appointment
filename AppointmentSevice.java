package nimblix.in.HealthCareHub.service;

import nimblix.in.HealthCareHub.entity.AppointmentDto;
import java.util.List;

public interface AppointmentService {
    AppointmentDto bookAppointment(AppointmentDto appointment);
    List<AppointmentDto> getAllAppointments();
}