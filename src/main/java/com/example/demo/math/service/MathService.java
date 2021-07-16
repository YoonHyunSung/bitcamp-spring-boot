package com.example.demo.math.service;

import com.example.demo.math.domain.MathDTO;

public interface MathService {
    int add(MathDTO calculator);//CaculatorDTO의 객체를 calculator인스턴스를 만든다
    int subtract(MathDTO calculator);//CalaulatorDTO calculator
    int multiple(MathDTO calculator);
    int divide(MathDTO calculator);
    int remain(MathDTO calculator);
    int[] sequence(MathDTO calculator);
}
