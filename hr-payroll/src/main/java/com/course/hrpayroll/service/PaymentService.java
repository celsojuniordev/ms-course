package com.course.hrpayroll.service;

import com.course.hrpayroll.domain.orm.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("Bob", 200.0, days);
    }
}
