package com.redisgcp.redisdemo.service;

import com.redisgcp.redisdemo.model.Plant;

import java.util.List;

public interface PlantService {
    boolean savePlant(Plant plant);

    List<Plant> fetchAllPlant();
}
