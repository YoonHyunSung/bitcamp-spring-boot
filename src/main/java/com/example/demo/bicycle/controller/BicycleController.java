package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BicycleController extends LambdaUtils {
    private BicycleService bicycleService;
    public BicycleController(){
        bicycleService = new BicycleServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = null;
        while (true) {
            System.out.println("0-종료 1-자전거등록 2-자전거목록" );
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    bicycle = new BicycleDTO();
                    print.accept("기어의 갯수는 몇개인가요 ?");
                    bicycle.setGear(scanner.next());
                    print.accept("어느 회사의 제품인가요 ?");
                    bicycle.setCompany(scanner.next());
                    print.accept("최대 속력 ?");
                    bicycle.setSpeed(scanner.next());
                case "2":
                    print.accept(string.apply(bicycleService.count()));
                    break;
                case "3":
                    List<BicycleDTO> list = (List<BicycleDTO>) bicycleService.show();
                    for (BicycleDTO b:list){
                        print.accept(b.toString());
                    }
            }
        }
    }
}
