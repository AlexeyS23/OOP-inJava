package com.company.class21.Task1;

//Create a class 'Degree' having a method 'getPrerequisite' that prints "To get a degree you need high school diploma".
        //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters class override method 'getPrerequisite'.
        //Call the method by creating an object of each of the three classes.

public class Degree {

    void getPrerequisite (){
        System.out.println("To get a Degree you need a high school diploma");
       }
}
class Bachelors extends Degree{

}
class Masters extends Bachelors{
    void getPrerequisite(){
        System.out.println("Yo get a master you need to have Barchelos Degree");
    }
}
class Tester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
    }
}