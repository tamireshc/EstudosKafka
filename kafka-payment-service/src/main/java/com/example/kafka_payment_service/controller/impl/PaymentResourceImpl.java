package com.example.kafka_payment_service.controller.impl;

import com.example.kafka_payment_service.model.Payment;
import com.example.kafka_payment_service.controller.PaymentResource;
import com.example.kafka_payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payments")
public class PaymentResourceImpl implements PaymentResource {

    @Autowired
    PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(@RequestBody Payment payment) {
        paymentService.payment(payment);
        return ResponseEntity.status(201).build();
    }
}
