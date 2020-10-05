package com.hugo.courselab.repository;

import com.hugo.courselab.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}