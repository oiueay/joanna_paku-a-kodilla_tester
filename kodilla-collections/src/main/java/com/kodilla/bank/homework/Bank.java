package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {
    private CashMachine[] atms = new CashMachine[0];

    public void addCashMachine(CashMachine cashMachine) {
        atms = Arrays.copyOf(atms, atms.length + 1);
        atms[atms.length - 1] = cashMachine;
    }

    public double getTotalSaldo() { //całkowity bilans ze wszystkich bankomatów,
        double sum = 0;
        for (CashMachine cashMachine : atms) {
            sum += cashMachine.getSaldo();
        }
        return sum;
    }

    public int getNumberOfPayIn(){
        int sum = 0;
        for (CashMachine cashMachine : atms) {
            sum += cashMachine.countPayInTransaction();
        }
        return sum;
    }

    public int getNumberOfPayOut(){
        int sum = 0;
        for (CashMachine cashMachine : atms) {
            sum += cashMachine.countPayOutTransaction();
        }
        return sum;
    }

    public double getAverageOfPayOut(){
        double sum = 0;
        for (CashMachine cashMachine : atms) {
            sum += cashMachine.averageWithdrawal();
        }
        return sum/ atms.length;
    }

    public double getAverageOfPayIn(){
        double sum = 0;
        for (CashMachine cashMachine : atms) {
            sum += cashMachine.averageDeposit();
        }
        return sum/ atms.length;
    }
}