package com.company.class22.example2;

public class PersonTester {
    public static void main(String[] args) {
        // Person person=new Teacher (name: "Asghar");
        //person.eat();
        Teacher teacher=new Teacher("Asghar");
        teacher.eat();

        Person[] persons={new Student("Farhad"), new Employee("Naiya"), new Teacher("Asel")};
        for (Person persons2:persons) {
            persons2.performDailyTasks();

            if (persons2 instanceof Teacher) {
                ((Teacher) persons2).design();
            }
        }
    }
}
