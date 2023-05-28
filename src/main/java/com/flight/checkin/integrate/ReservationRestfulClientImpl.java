package com.flight.checkin.integrate;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flight.checkin.dto.Reservation;
import com.flight.checkin.dto.ReservationUpdateRequest;
import com.flight.checkin.integration.ReservationRestfulClient;

@Component                                      //SterioType. puting on the class not on Interface.
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate(); //consume the web services from the url. BuiltIn class it is.
		//this url fetch data from DB put that in Json object.thn converted into res.class !
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		return reservation;
	}
    @Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
    	RestTemplate restTemplate = new RestTemplate();
    	Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation", request,Reservation.class);
    	 return reservation;
    }
}