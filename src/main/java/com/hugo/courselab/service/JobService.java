package com.hugo.courselab.service;

import com.hugo.courselab.entity.Job;
import java.util.List;

public interface JobService {
    Job getById(Integer id);
    String save(Job entity);
    String update(Job entity);
    String delete(Job entity);
    List<Job> findAll();
}