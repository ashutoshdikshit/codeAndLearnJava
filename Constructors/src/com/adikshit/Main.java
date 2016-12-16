package com.adikshit;

public class Main {

    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount("11122211", 0.00, "Ashutosh",
                "ashu@ad.com", "1112223333");
        myBankAccount.makeTransaction(1000.00, "Deposit");
        myBankAccount.makeTransaction(200.00, "Withdraw");
        myBankAccount.makeTransaction(2000.00, "Deposit");
        myBankAccount.makeTransaction(1000.00, "Withdraw");
    }
}
