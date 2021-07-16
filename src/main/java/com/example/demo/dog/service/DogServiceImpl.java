package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class
DogServiceImpl implements DogService {
    private final DogDTO dog;//Class
    private final List<DogDTO> dogs;//Collection Class
    //???List = interface <> = generic DogDTO = generictype dogs = instanceVariable
    public DogServiceImpl(){
        dog = new DogDTO();
        dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<?> show() {
        return dogs;
    }

    @Override
    public String barking(String bark) {
        return dog.toString()+bark+"짖는다";
    }

    @Override
    public String fetching(String target) {
        return dog.toString()+target+"을 물어온다";
    }

    @Override
    public String waggingtail() {
        return "꼬리를 흔든다";
    }
}
