package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;

import java.util.List;

//barking, fetching, wagging tail
//interface또한 DTO와 같이 1차원 적으로 타입으로 구분한다
//interface 는 기능을 처리하는 기능 객체
//DTO는 는 속성을 처리하는 속성 객체
//interface(기능)+DTO(속성객체) = model모델객체
public interface DogService/*파스칼표기법*/ {
    void add(DogDTO dog);
    int count();
    List<?> show();
    String barking(String bark);//카멜표기법
    String fetching(String target);
    String waggingtail();
}
