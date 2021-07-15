package com.example.demo.bank.domain;

import lombok.Data;
@Data
public class BankAccountDTO {
    public static final String BANK_NAME ="우리은행";//Constant선언//ClassVariable, 생성자로써 초기화 되면안된다.
    private String name;//varible 과 constant의 차이는 공간의 assignment 내용을 변경할수 있는지에 대한 차이가있다
    private String money;//클래스 내부에서 assignment가이루어진 함수는 클래스변수이며 , 외부에 constant가 되어 값이 초기화된 변수는 instance변수가 된다
    private String accountNumber;//instanceVarible
    private String date;//생성자로 생성이된다면 인스턴트 변수 아니라면 멤버변수.
    private String interest;
    private String balance;

    /*public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance(){
        return 0;*/
    @Override
    public String toString() {
        return String.format("이름 :%s 은행 :%s, 잔액 :%s, 계좌번호 :%s ",name,BANK_NAME,balance,accountNumber+"\n");
    }
    }