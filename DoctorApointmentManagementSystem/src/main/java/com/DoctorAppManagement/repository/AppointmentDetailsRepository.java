package com.DoctorAppManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoctorAppManagement.model.AppointmentDetails;


public interface AppointmentDetailsRepository extends JpaRepository<AppointmentDetails, Long>{
	

}
