package com.company.class26.HWSetTask1_2_3;
//Create a Set collection that will hold Objects of Student Type.
//In this set we do not care about the insertion order.
//Each student object should have name and studentID.
//Display name of each student.

import java.util.HashSet;

public class studentType {
    String nameStudent;
    double idStudent;

    studentType(String nameStudent, double idStudent){
        this.nameStudent=nameStudent;
        this.idStudent=idStudent;
    }void studentData(){
        System.out.println(nameStudent+" "+idStudent);
    }
        public static void main(String[] args) {
            HashSet<studentType>student=new HashSet<>();
            student.add(new studentType("Alexey",123));
            student.add(new studentType("Sorbon", 124));
            student.add(new studentType("Aysha",125));
            student.add(new studentType("Ahmet",126));
            student.add(new studentType("Hasim",127));
            student.add(new studentType("Silva",128));
            student.add(new studentType("Zema",129));

            for (studentType c: student){
                c.studentData();

            }
            }
    }

