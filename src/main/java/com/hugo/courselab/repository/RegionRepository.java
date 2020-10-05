package com.hugo.courselab.repository;

import com.hugo.courselab.entity.Region;
import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends CrudRepository<Region, Integer> {
}