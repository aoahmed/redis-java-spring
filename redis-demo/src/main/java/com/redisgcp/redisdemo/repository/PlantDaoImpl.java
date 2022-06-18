package com.redisgcp.redisdemo.repository;


import com.redisgcp.redisdemo.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlantDaoImpl implements PlantDao{

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "PLANT";
    @Override
    public boolean savePlant(Plant plant) {
        try {
            redisTemplate.opsForHash().put(KEY, plant.getId(), plant);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Plant> fetchAllPlant() {
        List<Plant> plants;
        plants = redisTemplate.opsForHash().values(KEY);
        return plants;
    }
}
