package com.course.hrworker.resources;

import com.course.hrworker.domain.orm.Worker;
import com.course.hrworker.domain.repository.WorkerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository repository;

    @GetMapping()
    public ResponseEntity<List<Worker>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable("id") Long id) {

        log.info("PORT = " + env.getProperty("local.server.port"));

        return ResponseEntity.ok(repository.findById(id).get());
    }

}
