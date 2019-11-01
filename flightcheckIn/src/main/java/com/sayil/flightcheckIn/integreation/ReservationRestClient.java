package com.sayil.flightcheckIn.integreation;

import com.sayil.flightcheckIn.integreation.dto.Reservation;
import com.sayil.flightcheckIn.integreation.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
