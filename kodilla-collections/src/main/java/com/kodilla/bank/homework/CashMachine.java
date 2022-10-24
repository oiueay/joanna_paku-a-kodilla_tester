//package com.kodilla.bank.homework;
//import java.util.Arrays;
//
//public class CashMachine {
//
//    private double[] transactions = new double[0];
//
//    public void payIn(double value) {
//        addTransaction(value);
//    }
//
//    public void payOut(double value) {
//        addTransaction(-value);
//    }
//
//    private void addTransaction(double value) {
//        transactions = Arrays.copyOf(transactions, transactions.length + 1);
//        transactions[transactions.length - 1] = value;
//    }
//
//    public int countTransactions() { //liczbę wykonanych transakcji
//        return transactions.length;
//    }
//
//    public double getSaldo() { // bilans z bankomatu,
//        double sum = 0;
//        for (double value : transactions) {
//            sum += value;
//        }
//        return sum;
//    }
//
//    int countPayOutTransaction() {  ///       liczbę transakcji związanych z wypłatą,
//        return transactions.length - ;
//    }
//
//    int countPayInTransaction() {   //        liczbę transakcji związaną z wpłatą pieniędzy,
//        return 0;
//    }
//
//    int averageWithdrawal() {    //        średnią wartość wpłaty.
//        return 0;
//    }
//
////    double averageDeposit() {   //        średnią wartość wypłaty,
////        double sum = 0;
////        for (double value : transactions) {
////            sum += value;
////        }
////        return sum/;
////    }
//}
//
//
