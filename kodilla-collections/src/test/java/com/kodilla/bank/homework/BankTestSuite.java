//package com.kodilla.bank.homework;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class BankTestSuite {
//
//    @Test
//    void shouldCountTotalSaldo() {
//        //given
//        CashMachine c1 = new CashMachine();
//        c1.payIn(1000);
//        c1.payIn(500);
//        c1.payOut(200);
//
//        CashMachine c2 = new CashMachine();
//        c2.payIn(500);
//        c2.payOut(400);
//
//        Bank bank = new Bank();
//        bank.addCashMachine(c1);
//        bank.addCashMachine(c2);
//
//        //when
//        double result = bank.getTotalSaldo();
//
//
//        //then
//        Assertions.assertEquals(1400, result, 0.001);
//
//    }
//}
