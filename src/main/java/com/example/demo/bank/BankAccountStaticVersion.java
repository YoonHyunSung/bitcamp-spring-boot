package com.example.demo.bank;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

public class BankAccountPO {
    static int balance = 0; //계좌 역할.
    //public = 접근제어자(다른클래스에서 메소드를 불러올수없게한다.
    //void = return 값이 없을때 사용한다
    public static void main(String[] args) {
        deposit(40000);     //입금 진행
        checkMybalance();       // 잔액 확인
        withdraw(7000);     // 출금 진행
        checkMybalance();       // 잔액 확인
    }

    public static int deposit(int amount){  //입금을 담당하는 메소드
        balance += amount; // balance = balance amount;
        return balance;
    }
    public static int withdraw(int amount){     // 출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }
    public static int checkMybalance(){     // 예금 조회를 담당하는 메소드
        System.out.println("잔액 :"+balance);
        return balance;
    }


}
