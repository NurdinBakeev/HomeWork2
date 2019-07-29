package com.company;

import com.company.HomeWork.BankAccount;

public class Main {
    private static int age;

    public static void main(String[] args) throws Exception{
        BankAccount f = new BankAccount();
        f.deposit(10000);
        while (true){
            f.withDraw(6000);
        }
    }
}

