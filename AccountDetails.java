package com;

class Account{
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt)
    {
        acc_no = a;
        name = n;
        amount = amt;
    }
    void deposit(float amt) {
        amount += amt;
        System.out.println(amt+ " deposited successfully");
    }
    void withdraw(float amt) {
        if (amount<amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount -= amt;
            System.out.println(amt+" Withdrawn Successfully");
        }
    }
    void checkBalance() {
        System.out.println("Balance is:- "+amount);
    }
    void display() {
        System.out.println("Account no- "+acc_no);
        System.out.println("Account holder name - "+name);
        System.out.println("Amount - "+amount);
    }
}
public class AccountDetails {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.insert(456632,"Radha",8000);
        a1.display();
        a1.checkBalance();

        a1.deposit(4000);
        a1.checkBalance();
        
        a1.withdraw(2000);
        a1.checkBalance();

    }
}
