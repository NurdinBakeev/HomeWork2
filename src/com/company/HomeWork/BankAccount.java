package com.company.HomeWork;

public class BankAccount {


    private double amount;
    double vallet;

    public double getAmount() {
        return amount;
    }


    public void deposit(double sum){
        vallet = vallet + sum;
    }

    public void withDraw(double sum) throws LimitException {
        vallet = vallet - sum;

        if (vallet < 0)
            throw new LimitException("Ваша сумма меньше чем остаток на счёте ", vallet);
    }
}
