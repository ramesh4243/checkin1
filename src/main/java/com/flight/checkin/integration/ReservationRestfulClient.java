package com.flight.checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.flight.checkin.dto.Reservation;
import com.flight.checkin.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(Long id);  // it will give reservation object.
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);  //It take java object and map to Json Object.
}
