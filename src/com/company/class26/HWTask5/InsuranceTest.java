package com.company.class26.HWTask5;

import java.util.ArrayList;

public class InsuranceTest{

    public static void main(String[] args) {
        ArrayList<Insurance> cars = new ArrayList<>();
        cars.add(new Car("Сhevrolet", "Aveo"));
        cars.add(new Pet("Dog","Dog"));
        cars.add(new Health("Ali"));


        for (Insurance c : cars) {
            c.getQuote();
            c.cancelInsurance();
        }

    }
    }

