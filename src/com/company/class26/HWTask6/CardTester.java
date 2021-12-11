package com.company.class26.HWTask6;

import java.util.ArrayList;

public class CardTester {
    public static void main(String[] args) {
        ArrayList<Card>card=new ArrayList<>();
        card.add(new creditCard("credit"));
        card.add(new debitCard("debit"));
        card.add(new prepaidCards("prepaid"));

        for (Card c:card){
            c.cashWithdrawal();
            c.payment();
        }
    }
}
