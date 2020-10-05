package com.hugo.courselab.service;

import com.hugo.courselab.entity.JobHistory;
import com.hugo.courselab.repository.JobHistoryRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryServiceImpl implements JobHistoryService{
    private JobHistoryRepository repository;

    @Autowired
    public void setProductRepository(JobHistoryRepository repository) {
        this.repository = repository;
    }

    public JobHistory getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(JobHistory entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(JobHistory entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(JobHistory entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<JobHistory> findAll() {
        return (List<JobHistory>) repository.findAll();
    }
}