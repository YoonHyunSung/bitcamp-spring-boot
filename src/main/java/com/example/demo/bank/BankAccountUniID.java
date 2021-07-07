package com.example.demo;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

class Circle{

        final double PI=3.14;
        double radius;

        public Circle(double radius){
            this.radius = radius;
        }
        //기능

        public double area(double rad){
        double result = rad * rad * PI;
        return result;

         }
        public double area(Circle cir){
            double result = cir.radius * cir.radius * PI;
            return result;

        }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.6);
        Circle c2 = new Circle(3.0);

        System.out.println(c1.area(c1));

    }
}



class BankAccount1 {
    String accNumber;
    String ssNumber;
    int balance = 0;

    public  BankAccount1(String acc, String ss, int bal){     //생성자
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    /*
    public void initAccount(String acc, String ss, int bal){//초기화를 위한 메소드
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }*/
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMybalance(){
        System.out.println("계좌번호 :"+accNumber);
        System.out.println("주민번호 :"+ssNumber);
        System.out.printf("잔액: " + balance +'\n'); //'\':이스케이프 시퀀스
        return balance;
    }
}
class BankAccountUniID{
    public static void main(String[] args) {
        BankAccount1 yoon = new BankAccount1("12-34-89", "990990-9090990", 10000);
        //yoon.initAccount("12-34-89", "990990-9090990", 10000);

        BankAccount1 park = new BankAccount1("33-55-09", "770088-5959007", 10000);
        //park.initAccount("33-55-09", "770088-5959007", 10000); 클래스로 주소설정

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withraw(2000);
        park.withraw(2000);
        yoon.checkMybalance();
        park.checkMybalance();
    }

}
