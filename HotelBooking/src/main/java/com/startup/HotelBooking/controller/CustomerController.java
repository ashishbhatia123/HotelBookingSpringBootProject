package com.startup.HotelBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.startup.HotelBooking.service.IHotelBookingCustomerService;

@RestController
public class CustomerController {
	
@Autowired	
IHotelBookingCustomerService customerService;

}
