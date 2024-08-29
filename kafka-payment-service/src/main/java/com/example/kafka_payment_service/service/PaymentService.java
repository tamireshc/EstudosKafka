package com.example.kafka_payment_service.service;

import com.example.kafka_payment_service.model.Payment;

public interface PaymentService {
    public void payment(Payment payment);
}
