package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl extends LambdaUtils implements BicycleService{
    private final BicycleDTO bicycle;
    private final ArrayList<BicycleDTO> bicycles;

    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>();
    }

    @Override
    public int changinggear(BicycleDTO bicycle) {
        return 0; //string.apply(bicycle.getGear());
    }

    @Override
    public String changingpedal(BicycleDTO bicycle) {
        return bicycle.toString();
    }

    @Override
    public String applyingbrakes(BicycleDTO bicycle) {
        return null;
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<?> show() {
        return bicycles;
    }
}
