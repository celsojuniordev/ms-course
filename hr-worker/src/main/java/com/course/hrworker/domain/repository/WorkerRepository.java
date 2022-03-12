package com.course.hrworker.domain.repository;

import com.course.hrworker.domain.orm.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
