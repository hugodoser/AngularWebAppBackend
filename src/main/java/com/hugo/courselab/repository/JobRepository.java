package com.hugo.courselab.repository;

import com.hugo.courselab.entity.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer> {
}