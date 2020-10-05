package com.hugo.courselab.service;

import com.hugo.courselab.entity.Job;
import com.hugo.courselab.repository.JobRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{
    private JobRepository repository;

    @Autowired
    public void setProductRepository(JobRepository repository) {
        this.repository = repository;
    }

    public Job getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(Job entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(Job entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(Job entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<Job> findAll() {
        return (List<Job>) repository.findAll();
    }
}