package com.hugo.courselab.repository;

import com.hugo.courselab.entity.JobHistory;
import org.springframework.data.repository.CrudRepository;

public interface JobHistoryRepository extends CrudRepository<JobHistory, Integer> {
}