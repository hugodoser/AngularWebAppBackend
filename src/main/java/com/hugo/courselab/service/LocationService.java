package com.hugo.courselab.service;

import com.hugo.courselab.entity.Location;
import java.util.List;

public interface LocationService {
    Location getById(Integer id);
    String save(Location entity);
    String update(Location entity);
    String delete(Location entity);
    List<Location> findAll();
}