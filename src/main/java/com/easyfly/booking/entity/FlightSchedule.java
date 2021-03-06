package com.easyfly.booking.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FlightSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightScheduleId;
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight flightId; 
	private LocalDate flightScheduledDate;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private Integer availableSeats;
	private Double fare;
	private Integer travelTypeId;
}
