<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
     <h2>Reservation Details</h2>
     Passenger Name: ${reservation.getPassenger().firstName}<br>
     Passenger Email: ${reservation.getPassenger().email}<br>
     Passenger Name: ${reservation.getPassenger().phone}<br>
     operating Airlines: ${reservation.getFlight().operatingAirlines}<br>
     operating Airlines: ${reservation.getFlight().flightNumber}<br>
     operating Airlines: ${reservation.getFlight().departureCity}<br>
     operating Airlines: ${reservation.getFlight().arrivalCity}<br>
     operating Airlines: ${reservation.getFlight().dateOfDeparture}<br>
     operating Airlines: ${reservation.getFlight().estimatedDepartureTime}<br>
     <h2>Update No. Of Bags & Status</h2>
     <form action="proceedToCheckIn" method="post">
     <pre> 
          Reservation id<input type="text" name="id" value="${reservation.id}" readonly>
           Number Of Bags<input type="text" name="numberOfBags"/>
           <input type="Submit" value="proceed"/>
     </pre>
     </form>
</body>
</html>