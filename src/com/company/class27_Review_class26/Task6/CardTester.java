package com.company.class27_Review_class26.Task6;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> linkedList=new LinkedList();
        linkedList.add(new PrepairCard("CardType"));
        for (Card i:linkedList){
            i.calculateInterest();
            i.issueCard();
        }
    }
}
