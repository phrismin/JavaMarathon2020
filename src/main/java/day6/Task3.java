package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    Teacher god = new Teacher("Olga", "English");
    Student human = new Student("Adam");
    god.evaluate(human.getName());
    }
}

class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }

    void evaluate(String stud) {
        Random grade = new Random();
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + stud + " по предмету " + this.subject + " на оценку " + (grade.nextInt(4) + 2) + ".");
    }
}

class Student {
    String name;

    Student(String name) { this.name = name; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}