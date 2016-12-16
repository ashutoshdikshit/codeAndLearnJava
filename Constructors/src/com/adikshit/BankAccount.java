package com.adikshit;

/**
 * Created by adikshit on 11/24/16.
 */
public class BankAccount {
    private String accountNo;
    private Double balance = 0.00;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNo, Double balance, String customerName, String email, String phoneNumber) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void makeTransaction(Double amount, String txnType) {
        if (txnType.equalsIgnoreCase("deposit")) {
            this.balance += amount;
            System.out.println(amount + " Deposited successfully!!  New Balance is " + this.balance);
        } else if (txnType.equalsIgnoreCase("withdraw")) {
            if(this.balance - amount >= 0) {
                this.balance -= amount;
                System.out.println("Amount withdrawn. New Account Balance is " + this.balance);
            }
            else {
                System.out.println("Insufficient Funds in Account");
            }

        }
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
