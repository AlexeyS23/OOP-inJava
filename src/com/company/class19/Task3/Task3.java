package com.company.class19.Task3;

public class Task3 {
    //Write a Java program called Teacher.
    //	Identify features and behaviour of that Class.
    //	Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    //	that would have it their own features and behaviour. Test all 4 classes
    public static void main(String[] args) {
       ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Olga";
        chemistryTeacher.teachChemistry();

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();
    }
    }
class Teacher{
    String name;
    void tech(){
        System.out.println("Teacher can teach");
    }
}
  class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name+" teach math");
    }

  }
class ChemistryTeacher extends Teacher {
    void teachChemistry() {
        System.out.println(name + " teach chem");
    }
}
class PianoTeacher extends Teacher {
    void teachPiano() {
        System.out.println(name + " teach Piano");
    }
}