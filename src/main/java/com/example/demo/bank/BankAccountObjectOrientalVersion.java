package com.example.demo.bank;

class BankAccount{
    int balance = 0; //예금잔액

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;//return 키워드 사용하면 함수를 즉시 종료하고 값을 반환한다.
    }

    public int checkMyBalance() {
        System.out.println("잔액 :" + balance);
        return balance;
    }
}
class BankAccountOO{
    public static void main(String[] args) {
        //두개의 인스턴스(객체) 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();
        //각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);
        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }

}
