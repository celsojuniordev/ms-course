package com.course.hrpayroll.feignClients;

import com.course.hrpayroll.domain.orm.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "http://localhost:8001", path = "/workers")
public interface WorkerFeignClients {

    @GetMapping("/{id}")
    ResponseEntity<Worker> findById(@PathVariable("id") Long id);
}
