package uu;

class Person {
    public void display() {
        System.out.println("This is a person");
    }
}

class Student extends Person {
    public void show() {
        System.out.println("This is a student");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.show();
    }
}