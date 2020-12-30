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
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }

    void evaluate(String stud) {
        Random rand = new Random();
        int grade = rand.nextInt(4) + 2;
        String word;
        switch (grade) {
            case 2:
                word = "неудовлетворительно";
                break;
            case 3:
                word = "удовлетворительно";
                break;
            case 4:
                word = "хорошо";
                break;
            default:
                word = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + stud + " по предмету " + this.subject + " на оценку " + word + ".");
    }
}

class Student {
    private String name;

    Student(String name) { this.name = name; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}