package com.example.demo.math.service;


import com.example.demo.math.domain.MathDTO;

public class MathServiceImpl implements MathService {
    @Override
    public int add(MathDTO math) {
        return math.getNum1() + math.getNum2();
    }

    @Override
    public int subtract(MathDTO math) {
        math.setResult( math.getNum1() - math.getNum2());
        return math.getResult();
    }

    @Override
    public int multiple(MathDTO math) {
        math.setResult(math.getNum1() * math.getNum2());
        return math.getResult();
    }

    @Override
    public int divide(MathDTO math) {
        math.setResult(math.getNum1() / math.getNum2());
        return math.getResult();
    }

    @Override
    public int remain(MathDTO math) {
        math.setResult(math.getNum1() % math.getNum2());
        return math.getResult();
    }

    @Override
    public int[] sequence(MathDTO math) {
        int count = math.getNum2() -math.getNum1() +1;
        int[] arr = new int[count];
        int i = 0;
        for (int j=math.getNum1(); j <=math.getNum2(); j++) {
            arr[i] = j;
            i++;
        }
        return arr;
    }

}