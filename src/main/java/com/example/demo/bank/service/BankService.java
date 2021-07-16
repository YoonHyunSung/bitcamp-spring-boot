package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankDTO;

import java.util.List;

/*
**은행이름을 상수로 정한다
이름 금액 계좌번호 입력한후 입금한다 잔액반환 입금
이름, 금액, 계좌번호  입력후 출금한후 잔액을 확인한다.출금
이름 금액 계좌번호 입력한후 잔액을 확인하면 잔액이 보인다
이름을 입력하면 계좌가 생성된다
이름, 계좌번호 를 입력한후 계좌를 해지한다.*/
public interface BankService {
    void add(BankDTO bankAccount);
    String count();
    List<?> findAll();
    String[] findAllAccountNumber();
    void creationAccount(BankDTO bankAccount);//계좌생성
    String balancecheck(BankDTO bankAccount);//잔액확인
    void deposit(BankDTO bankAccount);//입금
    void withdraw(BankDTO bankAccount);//출금
    void accountcancellation(BankDTO bankAccount);//계좌해지
}
