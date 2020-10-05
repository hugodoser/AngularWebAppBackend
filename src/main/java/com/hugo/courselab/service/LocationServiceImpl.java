package com.hugo.courselab.service;

import com.hugo.courselab.entity.Location;
import com.hugo.courselab.repository.LocationRepository;
import com.hugo.courselab.config.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{
    private LocationRepository repository;

    @Autowired
    public void setProductRepository(LocationRepository repository) {
        this.repository = repository;
    }

    public Location getById(Integer id) {
        return repository.findById(id).get();
    }

    public String save(Location entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String update(Location entity) {
        try{
            repository.save(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public String delete(Location entity) {
        try{
            repository.delete(entity);
            return Response.configureResponse("OK", "");
        } catch(Exception e) {
            return Response.configureResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }

    public List<Location> findAll() {
        return (List<Location>) repository.findAll();
    }
}