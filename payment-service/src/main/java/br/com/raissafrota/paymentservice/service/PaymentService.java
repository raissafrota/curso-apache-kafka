package br.com.raissafrota.paymentservice.service;

import br.com.raissafrota.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
