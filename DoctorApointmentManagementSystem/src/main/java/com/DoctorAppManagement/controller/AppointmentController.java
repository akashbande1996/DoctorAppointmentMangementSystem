package com.DoctorAppManagement.controller;



import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.DoctorAppManagement.model.AppointmentDetails;
import com.DoctorAppManagement.service.AppointmentService;

@Controller
public class AppointmentController {
	 
	private AppointmentService appointmentService;

	public AppointmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}
	//bookappointment
	@PostMapping(value = "/bookappointment",  consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public String bookAppointment(@Valid @ModelAttribute("AppointmentDetails") AppointmentDetails appointmentDetails,BindingResult bindingResult){
	
		ResponseEntity<AppointmentDetails> response = new ResponseEntity<AppointmentDetails>(appointmentService.bookAppointment(appointmentDetails), HttpStatus.OK);
		System.out.println("Status code : "+response.getStatusCodeValue());
	
		return "SuccessMessage";
	}
}
