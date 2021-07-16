package com.example.demo.bicycle.domain;

import lombok.Data;

//접근제어자 public 어떤 클래스에서도 접근이 가능하다.
@Data
public class BicycleDTO {
    private String gear;//variable 변수
    private String company;
    private String speed;
    @Override//
    public String toString() {//model
        return String.format( "기어갯수 : %d,회사 : %s, 최고속력 : %d",gear,company,speed);
    }
}