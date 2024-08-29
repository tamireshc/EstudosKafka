package com.example.kafka_payment_service.service.impl;

import com.example.kafka_payment_service.model.Payment;
import com.example.kafka_payment_service.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void payment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMP ::: Payment processed: " + payment);
    }
}
