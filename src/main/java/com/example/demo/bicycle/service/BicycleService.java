package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.List;

//changing gear, changing pedal, applyingbrakes
//interface또한 DTO와 같이 1차원 적으로 타입으로 구분한다
//interface 는 기능을 처리하는 객체 속성객체
//DTO는 는 속성을 처리하는 기능 객체
//interface(기능객체)+DTO(속성객체) = model모델객체
public interface BicycleService {
    int changinggear(BicycleDTO bicycle);
    String changingpedal(BicycleDTO bicycle);
    String applyingbrakes(BicycleDTO bicycle);
    void add(BicycleDTO bicycle);
    int count();
    List<?> show();
}
