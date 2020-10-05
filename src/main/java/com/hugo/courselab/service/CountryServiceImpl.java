package com.hugo.courselab.service;

import com.hugo.courselab.entity.Country;
import com.hugo.courselab.repository.CountryRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    private CountryRepository repository;

    @Autowired
    public void setProductRepository(CountryRepository repository) {
        this.repository = repository;
    }

    public Country getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(Country entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(Country entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(Country entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<Country> findAll() {
        return (List<Country>) repository.findAll();
    }
}