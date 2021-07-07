package com.example.demo.test;

public class WhileFor {
    public static void main(String[] args) {
        int n = 1, sum = 0;
        while (n <= 10) {
            sum += n;
            n++;
        }
        System.out.println(sum);

        int sum1 = 0;

        for (int i = 1; i <= 10; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
    }
    }
