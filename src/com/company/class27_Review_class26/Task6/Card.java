package com.company.class27_Review_class26.Task6;

public abstract class Card {

    String cardType;
    public Card(String cardType){
        this.cardType=cardType;
    }
    public void issueCard(){
        System.out.println(cardType+" Issue");
    }
    public abstract void calculateInterest();
}
class PrepairCard extends Card{

    public PrepairCard(String cardType) {
        super(cardType);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Bla");

    }
}
