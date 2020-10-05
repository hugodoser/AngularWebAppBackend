package com.hugo.courselab.repository;

import com.hugo.courselab.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}