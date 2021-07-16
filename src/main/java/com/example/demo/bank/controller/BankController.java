package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankDTO;
import com.example.demo.bank.service.BankServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class BankController extends LambdaUtils {
    private BankServiceImpl bankService;
    BankDTO bank;

    public BankController() {
        bankService = new BankServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print.accept("Menu 0-Exit 1-계좌생성 2-계좌목록 3-계좌번호목록 4-입금 5-출금");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    bank =new BankDTO();
                    print.accept("이름 : ");
                    bank.setName(scanner.next());
                    print.accept("초기 금액 :");
                    bank.setBalance(scanner.next());
                    bankService.creationAccount(bank);
                    break;
                case "2":
                    print.accept(string.apply(bankService.findAll()));
                    break;
                case "3":
                    for(String s: bankService.findAllAccountNumber()){
                        print.accept(s + "\n");
                    }
                    break;
                case "4":
                    bank =new BankDTO();
                    print.accept("계좌번호");
                    bank.setAccountNumber(scanner.next());
                    print.accept("입금액 : ");
                    bank.setMoney(scanner.next());
                    bankService.deposit(bank);
                    break;
                case "5":
                    bank =new BankDTO();
                    print.accept("계좌번호");
                    bank.setAccountNumber(scanner.next());
                    print.accept("출금액 : ");
                    bank.setMoney(scanner.next());
                    bankService.withdraw(bank);
                    break;
            }
        }
    }
}
   /* public String[] findAllAccountNumber(){//계좌번호목록 조회
        for(String accountNumber: bankAcoountService.findAllAccountNumber()){
            System.out.println(accountNumber + "\n");
        }
        return bankAcoountService.findAllAccountNumber();
    }
    public void add(BankAccountDTO bankAccount){
        bankAcoountService.add(bankAccount);

    }
    public void show(BankAccountDTO bankAccount){//계좌수 와 계좌 목록
        System.out.println(bankAcoountService.count());
        System.out.println(bankAcoountService.findAll());
    }
    public void creationAccount(BankAccountDTO bankAccount) {//계좌생성
        bankAcoountService.creationAccount(bankAccount);
    }

    public String balancecheck(BankAccountDTO bankAccount) {
        return bankAcoountService.balancecheck(bankAccount);
    }

    public String deposit(BankAccountDTO bankAccount) {
        return bankAcoountService.deposit(bankAccount);
    }

    public String withdraw(BankAccountDTO bankAccount) {
    return "";
    }

    public void accountcancellation(BankAccountDTO bankAccount) {

    }
*/




   /* private BankAccountDTO bankAccount;
    private Scanner scanner;
    private BankAcoountService bankAcoountService;
    public BankAccountController() {
        this.bankAccount =new BankAccountDTO();
        this.scanner = new Scanner(System.in);
        bankAcoountService = new BankAcoountServiceImpl();
    }
    public void main(){
        while (true){
            System.out.println("1 계좌생성 2잔액확인 3입금 4출금 5계좌해지");
            switch (scanner.next()){

                case "1":bankAcoountService.creationAccount(bankAccount);break;
                case "2": bankAcoountService.balancecheck(bankAccount);
                    System.out.printf("은행%s\t 잔액%d\t계좌번호%d\t",bankAccount.BANK_NAME,bankAccount.getBalance(),bankAccount.getAccountNumber());break;
                case "3":System.out.println("입금금액 ? ");
                    bankAccount.setMoney(scanner.nextInt());
                    bankAcoountService.deposit(bankAccount);break;
                case "4":System.out.println("출금 금액 ? :");
                    bankAccount.setMoney(scanner.nextInt());
                    bankAcoountService.withdraw(bankAccount);break;
            }
        }
    }

*/