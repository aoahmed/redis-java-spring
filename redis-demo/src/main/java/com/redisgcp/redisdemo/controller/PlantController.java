package com.redisgcp.redisdemo.controller;


import com.redisgcp.redisdemo.model.Plant;
import com.redisgcp.redisdemo.service.PlantService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PlantController {
    @Autowired
    private PlantService plantService;

    @PostMapping("/plant")
    public ResponseEntity<String> savePlant(@RequestBody Plant plant){
        boolean result = plantService.savePlant(plant);
        if (result)
            return ResponseEntity.ok("Plant Created Successfully !!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/plant")
    public ResponseEntity<List<Plant>> fetchAllPlant(){
        List<Plant> plants;
        plants = plantService.fetchAllPlant();
        return ResponseEntity.ok(plants);
    }

}
