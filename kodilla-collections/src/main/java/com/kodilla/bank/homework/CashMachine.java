package com.kodilla.bank.homework;
import java.util.Arrays;

public class CashMachine {

    private double[] transactions = new double[0];

    public void payIn(double value) {
        addTransaction(value);
    }

    public void payOut(double value) {
        addTransaction(-value);
    }

    private void addTransaction(double value) {
        transactions = Arrays.copyOf(transactions, transactions.length + 1);
        transactions[transactions.length - 1] = value;
    }

    public int countTransactions() { //liczbę wykonanych transakcji
        return transactions.length;
    }

    public double getSaldo() { // bilans z bankomatu,
        double sum = 0;
        for (double value : transactions) {
            sum += value;
        }
        return sum;
    }

    int countPayOutTransaction() {  // liczba transakcji związanych z wypłatą,
        int n=0;
        for(double value: transactions)
            if(value<0) n++;
        return n;
    }

    int countPayInTransaction() {   // liczba transakcji związana z wpłatą pieniędzy,
        int n=0;
        for(double value: transactions)
            if(value>0) n++;
        return n;
    }

   double averageWithdrawal() {    // średnia wartość wypłaty.
       int n=0;
       double sum=0;
       for(double value: transactions) {
           if (value < 0) {
               n++;
               sum += value;
           }
       }
       return sum/n;
    }

    double averageDeposit() {    // średnia wartość wpłaty.
        int n=0;
        double sum=0;
        for(double value: transactions) {
            if (value > 0) {
                n++;
                sum += value;
            }
        }
        return sum/n;
    }
}


