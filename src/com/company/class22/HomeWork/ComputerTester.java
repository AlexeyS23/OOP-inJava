package com.company.class22.HomeWork;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] computers={new Apple("Apple"),new Lenovo("Lenovo"),new HP("Hewlett-packard"),new Dell("Dell")};
        for(Computer comp:computers){
            comp.comp();
            comp.electricity();

            if (comp instanceof Apple){
                ((Apple)comp).cool();
            }
            if (comp instanceof Lenovo){
                ((Lenovo)comp).bad();
            }
            if (comp instanceof HP){
                ((HP)comp).work();
            }
            if (comp instanceof Dell){
                ((Dell)comp).my();
            }
            System.out.println("*********");





        }

    }
}
