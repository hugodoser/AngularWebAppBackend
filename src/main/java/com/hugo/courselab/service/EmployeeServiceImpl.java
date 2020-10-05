package com.hugo.courselab.service;

import com.hugo.courselab.entity.Employee;
import com.hugo.courselab.repository.EmployeeRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository repository;

    @Autowired
    public void setProductRepository(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(Employee entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(Employee entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(Employee entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }
}