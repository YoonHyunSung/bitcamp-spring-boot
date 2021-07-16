package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {
    private final BankDTO bank;//finalize
    private final List<BankDTO> banks;
    public BankServiceImpl() {//Constructor로 Instance생성.
        bank = new BankDTO();
        banks = new ArrayList<>();
    }

    @Override
    public void add(BankDTO bank) {
        banks.add(bank);
    }

    @Override
    public String count() {
        return string.apply(banks.size());
    }

    @Override
    public List<?> findAll() {
        return banks;
    }

    @Override
    public String[] findAllAccountNumber() {//계좌번호목록
        BankDTO bank = new BankDTO();
        int count = strToInt.apply(count());
        String[] findAllAccountNumber = new String[count];
        for (int i =0; i<count; i++) {
            findAllAccountNumber[i] = banks.get(i).getAccountNumber();
        }
        return findAllAccountNumber;
    }

    public void creationAccount(BankDTO bank) {//계좌생성
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(3,false)+"-"+
                utilService.randomNumbers(3,true)+"-"+
                utilService.randomNumbers(3,true);
        bank.setAccountNumber(accountNumber);
        bank.setInterest("0.01");
        bank.setDate(utilService.todayAndCurrentTiome());
        banks.add(bank);
    }

    @Override
    public String balancecheck(BankDTO bank) {//잔액조회
        System.out.println(bank.getBalance());
        return bank.getBalance();
    }

    @Override
    public void deposit(BankDTO param) {
        for (BankDTO a : banks){
            if (param.getAccountNumber().equals(a.getAccountNumber())){
                int balance = strToInt.apply(param.getBalance());
                a.setBalance(string.apply(balance+strToInt.apply(param.getMoney())));
            break;
            }

        }
    }


    @Override
    public void withdraw(BankDTO bank) {
        for (BankDTO a : banks){
            if (bank.getAccountNumber().equals(a.getAccountNumber())){
                int balance = strToInt.apply(a.getBalance());
                a.setBalance(string.apply(balance-strToInt.apply(bank.getMoney())));
                print.accept(""+a);
                break;
            }
        }
    }

    /*
        @Override
        public String deposit(BankDTO bank) {//입금
            int restMoney = strToInt.apply(bank.getMoney());
            bank.setBalance(restMoney+bank.getMoney());
            print.accept("계좌번호입력:");


            return this.bank.getBalance();
        }
        @Override
        public String withdraw(BankDTO bank) {//출금
            int restMoney = strToInt.apply(bank.getMoney());
            return "";
        }
    */
    @Override
    public void accountcancellation(BankDTO bankAccount) {

    }
}
