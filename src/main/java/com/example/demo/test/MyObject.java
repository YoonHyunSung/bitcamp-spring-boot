package com.example.demo.test;

import java.util.Scanner;

public class MyObject {
    public static void main(String[] args) {
        System.out.println("숫자 1");
        Scanner scanner = new Scanner(System.in);//new 를 통하여 객체 생성
        int num1 = scanner.nextInt();// 값을 저장 next() 값을 읽음. /* int num1 = scanner.nextInt(); float num1 = scanner.nextfloat(); 타입별로 변경가능 */
        System.out.println("숫자 2");
        int num2 = scanner.nextInt();  /*Scanner scanner2 = new Scanner(System.in);재사용성*/
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3);//%변수지정 %d10=진수의 변수
        }
}
;