package com.sayil.flightcheckIn.integreation;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sayil.flightcheckIn.integreation.dto.Reservation;
import com.sayil.flightcheckIn.integreation.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String RESERVATIONRESTURL = "http://localhost:9090/flightreservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		Reservation reservation = new RestTemplate().getForObject(RESERVATIONRESTURL+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		Reservation reservation = new RestTemplate().postForObject(RESERVATIONRESTURL, request, Reservation.class);
		return reservation;
	}

}
