package br.com.raissafrota.paymentservice.resource;

import br.com.raissafrota.paymentservice.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentResource {
    @PostMapping
    ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
