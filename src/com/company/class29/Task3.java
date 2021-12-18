package com.company.class29;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String,Integer>employeeMap=new HashMap<>();
        employeeMap.put("John", 120000);
        employeeMap.put("Jane",130000);
        employeeMap.put("Jon",110000);
        employeeMap.put("Smith",110000);
        String maxSalatyName="";
        double maxSalary=0;

        for (Map.Entry<String,Integer> emp: employeeMap.entrySet()
             ) {
            if (emp.getValue()>maxSalary){
                maxSalary=emp.getValue();
                maxSalatyName=emp.getKey();
            }
        }
        System.out.println(maxSalatyName+" "+maxSalary);
    }
}
