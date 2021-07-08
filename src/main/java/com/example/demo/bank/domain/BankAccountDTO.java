package com.example.demo.bank.domain;

public class BankAccount {
   int balance = 0;
   int amount;

   //public void setBalance(int balance){
       //this.balance = balance;
   //}
   //public  int getBalance(){
      // return balance;
   //}
   public void setBalance(int amount){
       balance += amount;
   }
   public int getBalance(){
       return balance;

   }
   public void setAmount(int amount){
       balance -= amount;
   }
   public int getAmount(){
       return balance;
   }

    @Override
    public String toString() {
        return String.format("잔액 %d",balance);
    }
   /*int balance = 0; //예금잔액

    public int deposit(int amount) {//메서드
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {//function
        balance -= amount;
        return balance;//return 키워드 사용하면 함수를 즉시 종료하고 값을 반환한다.
    }

    public int checkMyBalance(//파라미터) {//supplier
        System.out.println("잔액 :" + balance);
        return balance;
    }*/
}
