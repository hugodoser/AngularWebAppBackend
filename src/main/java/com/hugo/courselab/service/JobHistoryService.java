package com.hugo.courselab.service;

import com.hugo.courselab.entity.JobHistory;
import java.util.List;

public interface JobHistoryService {
    JobHistory getById(Integer id);
    String save(JobHistory entity);
    String update(JobHistory entity);
    String delete(JobHistory entity);
    List<JobHistory> findAll();
}