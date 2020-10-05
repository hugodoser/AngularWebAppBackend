package com.hugo.courselab.service;

import com.hugo.courselab.entity.Department;
import java.util.List;

public interface DepartmentService {
    Department getById(Integer id);
    String save(Department entity);
    String update(Department entity);
    String delete(Department entity);
    List<Department> findAll();
}