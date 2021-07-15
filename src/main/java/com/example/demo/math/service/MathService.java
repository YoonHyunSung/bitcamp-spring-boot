package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

public interface CalculatorService {
    int add(CalculatorDTO calculator);//CaculatorDTO의 객체를 calculator인스턴스를 만든다
    int subtract(CalculatorDTO calculator);//CalaulatorDTO calculator
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);
    int[] sequence(CalculatorDTO calculator);
}
