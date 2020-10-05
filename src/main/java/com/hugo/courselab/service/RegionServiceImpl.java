package com.hugo.courselab.service;

import com.hugo.courselab.entity.Region;
import com.hugo.courselab.repository.RegionRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{
    private RegionRepository repository;

    @Autowired
    public void setProductRepository(RegionRepository repository) {
        this.repository = repository;
    }

    public Region getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(Region entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(Region entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(Region entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<Region> findAll() {
        return (List<Region>) repository.findAll();
    }
}