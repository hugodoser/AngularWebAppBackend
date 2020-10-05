package com.hugo.courselab.service;

import com.hugo.courselab.entity.Country;
import java.util.List;

public interface CountryService {
    Country getById(Integer id);
    String save(Country entity);
    String update(Country entity);
    String delete(Country entity);
    List<Country> findAll();
}