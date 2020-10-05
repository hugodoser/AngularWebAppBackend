package com.hugo.courselab.service;

import com.hugo.courselab.entity.Region;
import java.util.List;

public interface RegionService {
    Region getById(Integer id);
    String save(Region entity);
    String update(Region entity);
    String delete(Region entity);
    List<Region> findAll();
}