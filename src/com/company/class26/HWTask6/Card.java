package com.company.class26.HWTask6;
//Create a Card class that will have implemented  and unimplemented
// methods and a constructor that will initializes credit card type.
// Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Card {
    String typeOfOperation;
    Card (String typeOfOperation){
        this.typeOfOperation=typeOfOperation;
    }
    void cashWithdrawal(){
        System.out.println("The operation is carried out in the terminals");
    }
    abstract void payment();

    public static void main(String[] args) {

    }
}
class debitCard extends Card{
    debitCard(String typeOfOperation) {
        super(typeOfOperation);
    }
    @Override
    void payment() {
        System.out.println("The card allows you to use the available balance on the deposit account");
    }
}
class creditCard extends Card{
    creditCard(String typeOfOperation) {
        super(typeOfOperation);
    }
    @Override
    void payment() {
        System.out.println("A credit card may not be linked to a real bank account, depending on the limit");
    }
}
class prepaidCards extends Card{
    prepaidCards(String typeOfOperation) {
        super(typeOfOperation);
    }
    @Override
    void payment() {
        System.out.println("For salary, payment, social, transport");
    }
}

