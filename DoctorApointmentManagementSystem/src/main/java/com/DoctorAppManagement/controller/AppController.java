package com.DoctorAppManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DoctorAppManagement.model.AppointmentDetails;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String showIndex(Model model)
	{
		model.addAttribute("appointmentdetails", new AppointmentDetails());
		return "index";
	}
	@RequestMapping("/AppointmentBooked")
	public String showSuccessMsg()
	{
		return "SuccessMessage";
	}

}