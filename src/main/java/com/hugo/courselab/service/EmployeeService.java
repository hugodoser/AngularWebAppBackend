package com.hugo.courselab.service;

import com.hugo.courselab.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee getById(Integer id);
    String save(Employee entity);
    String update(Employee entity);
    String delete(Employee entity);
    List<Employee> findAll();
}