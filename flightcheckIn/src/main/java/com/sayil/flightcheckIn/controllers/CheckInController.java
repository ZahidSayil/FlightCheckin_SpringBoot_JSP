package com.sayil.flightcheckIn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sayil.flightcheckIn.integreation.ReservationRestClient;
import com.sayil.flightcheckIn.integreation.dto.Reservation;
import com.sayil.flightcheckIn.integreation.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {

	@Autowired
	ReservationRestClient reservationRestClient;
	
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckIn() {
		return "startCheckIn";
		
	}
	

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		
		Reservation reservation = reservationRestClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
		
	}
	
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId")Long reservationId, @RequestParam("numberOfBags") int numberOfbags) {
		ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckedIn(true);
		reservationUpdateRequest.setNumberOfBags(numberOfbags);
		reservationRestClient.updateReservation(reservationUpdateRequest);
		return "checkInConfirmation";
		
	}
	
	
	
}
