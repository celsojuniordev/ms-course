package com.course.hrpayroll.resource;

import com.course.hrpayroll.domain.orm.Payment;
import com.course.hrpayroll.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable("workerId") Long workerId, @PathVariable("days") Integer days) {
        return ResponseEntity.ok(service.getPayment(workerId, days));
    }

    public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer days) {
        return ResponseEntity.ok(new Payment("Bran", 400.0, days));
    }
}