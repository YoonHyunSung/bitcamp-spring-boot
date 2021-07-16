package com.example.demo.math.controller;

import com.example.demo.math.domain.MathDTO;
import com.example.demo.math.service.MathService;
import com.example.demo.math.service.MathServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class MathController extends LambdaUtils {
    private final MathService mathService;

    public MathController() {
        this.mathService = new MathServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print.accept("\n메뉴 0-종료 1-Calculator 2-Sequence 3-구구단\n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    calculate(scanner);
                    break;
                case "2":
                    sequence(scanner);break;
                case "3":gugudan(scanner);break;
            }
        }
    }

    public void calculate(Scanner scanner) {
        MathDTO math = new MathDTO();
        print.accept("첫번째 값을 입력하시오 : ");
        math.setNum1(scanner.nextInt());
        print.accept("연산자");
        math.setOpcode(scanner.next());
        print.accept("두번째 값을 입력하시오 : ");
        math.setNum2(scanner.nextInt());
        switch (math.getOpcode()) {
            case "+":
                math.setResult(mathService.add(math));
                break;
            case "-":
                math.setResult(mathService.subtract(math));
                break;
            case "*":
                math.setResult(mathService.multiple(math));
                break;
            case "/":
                math.setResult(mathService.divide(math));
                break;
            case "%":
                math.setResult(mathService.remain(math));
                break;
        }
        print.accept(string.apply(math));
    }
    public void sequence(Scanner scanner) {
        MathDTO math = new MathDTO();
        print.accept("수열의 시작값: ");
        math.setNum1(scanner.nextInt());
        print.accept("수열의 마지막값: ");
        math.setNum2(scanner.nextInt());
        int[] arr = mathService.sequence(math);
        for (int i = 0; i < arr.length; i++) {
            print.accept(arr[i] + "\t");
        }
    }

    public void gugudan(Scanner scanner) {
        for (int j = 1; j <= 9; j++) {
            for (int i = 2; i < 6; i++) {
                print.accept(i + " * " + j + " = " + i * j + "\t");
            }
            print.accept("\n");
        }
        print.accept("\n");
        for (int j = 1; j <= 9; j++) {
            for (int i = 6; i < 10; i++) {
                print.accept(i + " * " + j + " = " + i * j + "\t");
            }
            print.accept("\n");
        }

    }
}