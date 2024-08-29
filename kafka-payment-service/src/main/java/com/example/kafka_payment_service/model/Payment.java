package com.example.kafka_payment_service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;
}
