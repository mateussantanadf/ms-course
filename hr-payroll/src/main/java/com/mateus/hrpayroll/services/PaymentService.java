package com.mateus.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.mateus.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getpayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
