package com.example.demo.common.controller;

import com.example.demo.bank.controller.BankController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.hiMart.controller.HiMartController;
import com.example.demo.math.controller.MathController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;
public class HomeController extends LambdaUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n메뉴 0-종료 1-Util 2-Math 3-Dog 4-Bicycle 5-Bank 6-HiMart");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    new UtilController().main();
                    break;
                //case "1":new CalculatorController().calculate();break;
                case "2":
                    new MathController().main();
                    break;
                case "3":
                    new DogController().main();
                    break;
                case "4":
                    new BicycleController().main();
                    break;
                case "5":
                    new BankController().main();
                    break;
                case "6":
                    new HiMartController().main();
            }

        }
    }
}