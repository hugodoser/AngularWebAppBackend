package com.hugo.courselab.repository;

import com.hugo.courselab.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}