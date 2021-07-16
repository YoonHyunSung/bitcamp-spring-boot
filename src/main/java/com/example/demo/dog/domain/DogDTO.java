package com.example.demo.dog.domain;

import lombok.Data;

@Data
public class DogDTO {
    private String name;
    private String color;
    private String breed;

    @Override
    public String toString() {
        return String.format("\n이름은 %s이고, 색깔은 %s이고, 품종은 %s인 강아지다 \n",name, color, breed);
    }
}
