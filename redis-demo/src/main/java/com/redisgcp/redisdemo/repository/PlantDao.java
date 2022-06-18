package com.redisgcp.redisdemo.repository;

import com.redisgcp.redisdemo.model.Plant;

import java.util.List;

public interface PlantDao {
    boolean savePlant(Plant plant);

    List<Plant> fetchAllPlant();
}
