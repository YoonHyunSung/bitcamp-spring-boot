package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankAcoountServiceImpl extends LambdaUtils implements BankAcoountService {
    private final BankAccountDTO bankAccount;//finalize
    private final List<BankAccountDTO> bankAccounts;
    public BankAcoountServiceImpl() {//Constructor로 Instance생성.
        bankAccount = new BankAccountDTO();
        bankAccounts = new ArrayList<>();
    }

    @Override
    public void add(BankAccountDTO bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override
    public List<?> findAll() {
        return bankAccounts;
    }

    @Override
    public String[] findAllAccountNumber() {//계좌번호목록
        int count = strToInt.apply(count());
        String[] findAllAccountNumber = new String[count];
        for (int i =0; i<count; i++) {
            findAllAccountNumber[i] = bankAccounts.get(i).getAccountNumber();
        }
        return findAllAccountNumber;
    }

    public void creationAccount(BankAccountDTO bankAccount) {//계좌생성
        //this.bankAccount = new BankAccountDTO();
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(3,false)+"-"+
                utilService.randomNumbers(3,true)+"-"+
                utilService.randomNumbers(3,true);
        bankAccount.setAccountNumber(accountNumber);
        bankAccounts.add(bankAccount);
    }

    @Override
    public String balancecheck(BankAccountDTO bankAccount) {//잔액조회
        System.out.println(bankAccount.getBalance());
        return bankAccount.getBalance();
    }

    @Override
    public String deposit(BankAccountDTO bankAccount) {//입금
        int restMoney = strToInt.apply(bankAccount.getMoney());
        bankAccount.setBalance(restMoney+bankAccount.getMoney());
        return this.bankAccount.getBalance();
    }

    @Override
    public String withdraw(BankAccountDTO bankAccount) {//출금
        int restMoney = strToInt.apply(bankAccount.getMoney());
        return "";
    }

    @Override
    public void accountcancellation(BankAccountDTO bankAccount) {

    }
}
