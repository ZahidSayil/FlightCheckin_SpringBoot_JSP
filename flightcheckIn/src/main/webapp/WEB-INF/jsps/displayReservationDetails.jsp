<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>

<h2>Flight Details</h2>

	Airline : ${reservation.flight.operatingAirlines}<br>
	Flight No : ${reservation.flight.flightNumber}<br>
	DepartureCity : ${reservation.flight.departureCity}<br>
	ArrivalCity : ${reservation.flight.arrivalCity}<br>
	Date of Departure : ${reservation.flight.dateOfDeparture}<br>
	Estimated Departure Time: ${reservation.flight.estimatedDepartureTime}<br>
<hr>

<h2>Passsenger Details</h2>
	
	First Name: ${reservation.passenger.firstName}<br>
	Last Name: ${reservation.passenger.lastName}	<br>
	Email Address : ${reservation.passenger.email}<br>
	Phone No: ${reservation.passenger.phone}
	<br><hr>
<form action="completeCheckIn" method="post">

Enter the name of bags you want to checkIn :  <input type="text" name="numberOfBags"/> <br>
<!-- hiding id of reservation from users --> <input type="hidden" value="${reservation.id}" name="reservationId"/>
											  <input type="submit" value="Check In">
</form>
</body>
</html>