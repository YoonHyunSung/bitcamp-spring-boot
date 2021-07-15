package com.example.demo.math.controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class CalculatorController extends LambdaUtils {
    CalculatorService calculatorService;// = new CalculatorServiceImpl();
    CalculatorDTO calculator; = new CalculatorDTO();
    Scanner scanner = new Scanner(System.in);

    public void calculate() {
        print.accept("첫번째 값을 입력하시오 : ");
        calculator.setNum1(scanner.nextInt());
        print.accept("연산자");
        calculator.setOpcode(scanner.next());
        //result = calculator.getNum1()calculator.getNum2();
        print.accept("두번째 값을 입력하시오 : ");
        calculator.setNum2(scanner.nextInt());
        int result = 0;
        switch (calculator.getOpcode()) {//switch statement
            case "+":
                result = calculatorService.add(calculator);
                break;
            case "-":
                result = calculatorService.subtract(calculator);
                break;
            case "*":
                result = calculatorService.multiple(calculator);
                break;
            case "/":
                result = calculatorService.divide(calculator);
                break;
            case "%":
                result = calculatorService.remain(calculator);
                break;
        }
        print.accept(calculator.toString());
    }
    public  void sequence() {
        print.accept("수열의 시작값 :");
        calculator.setNum1(scanner.nextInt());
        print.accept("수열의 마지막 값");
        calculator.setNum2(scanner.nextInt());
        int[] arr = calculatorService.sequence(calculator);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
    }

        }
    }
//       //i<arr.length = 배열의길이*/
