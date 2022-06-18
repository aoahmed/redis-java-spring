package com.redisgcp.redisdemo.service;


import com.redisgcp.redisdemo.model.Plant;
import com.redisgcp.redisdemo.repository.PlantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService{

    @Autowired
    private PlantDao plantDao;

    @Override
    public boolean savePlant(Plant plant) {
        return plantDao.savePlant(plant);
    }

    @Override
    public List<Plant> fetchAllPlant() {
        return plantDao.fetchAllPlant();
    }
}
