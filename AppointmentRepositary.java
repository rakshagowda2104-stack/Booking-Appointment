package nimblix.in.HealthCareHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nimblix.in.HealthCareHub.entity.AppointmentDto;

public interface AppointmentRepository extends JpaRepository<AppointmentDto, Long> {
}