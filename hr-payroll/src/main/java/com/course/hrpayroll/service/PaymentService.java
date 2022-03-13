package com.course.hrpayroll.service;

import com.course.hrpayroll.domain.orm.Payment;
import com.course.hrpayroll.domain.orm.Worker;
import com.course.hrpayroll.feignClients.WorkerFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(Long workerId, Integer days) {

        Worker worker = workerFeignClients.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
