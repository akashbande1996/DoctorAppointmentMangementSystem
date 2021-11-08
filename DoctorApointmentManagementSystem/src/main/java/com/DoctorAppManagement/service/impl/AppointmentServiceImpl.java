package com.DoctorAppManagement.service.impl;

import org.springframework.stereotype.Service;

import com.DoctorAppManagement.model.AppointmentDetails;
import com.DoctorAppManagement.repository.AppointmentDetailsRepository;
import com.DoctorAppManagement.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	private AppointmentDetailsRepository appointmentDetailsRepository;
	
	public AppointmentServiceImpl(AppointmentDetailsRepository appDetails) {
		this.appointmentDetailsRepository = appDetails;
	}
	
	@Override
	public AppointmentDetails bookAppointment(AppointmentDetails appointmentDetails) {
		
		return appointmentDetailsRepository.save(appointmentDetails);
	}

}
