package com.company.HomeWork;

public class LimitException extends Exception{

double remaningAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remaningAmount = remainingAmount;
    }

    public void getRemainingAmount(double remaningAmount) {
        this.remaningAmount = remaningAmount;
    }
}
