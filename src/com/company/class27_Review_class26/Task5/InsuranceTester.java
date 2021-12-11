package com.company.class27_Review_class26.Task5;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance>insuranceAr=new ArrayList<>();
      //  insuranceAr car=new Car("Mersedes","Bens");
      //  insuranceAr pet=new Pet("Dog", "Dog");
      //  insuranceAr health=new Health("Man");

        for (Insurance in:insuranceAr) {
            in.cancelInsurance();
            in.getQuote();

        }
    }
}
