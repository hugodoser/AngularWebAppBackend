package com.hugo.courselab.service;

import com.hugo.courselab.entity.Department;
import com.hugo.courselab.repository.DepartmentRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    private DepartmentRepository repository;

    @Autowired
    public void setProductRepository(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(Department entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(Department entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(Department entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<Department> findAll() {
        return (List<Department>) repository.findAll();
    }
}