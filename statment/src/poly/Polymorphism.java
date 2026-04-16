package poly;

class Person {
    public void role() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    public void role() {
        System.out.println("I am a student");
    }
}

class Teacher extends Person {
    @Override
    public void role() {
        System.out.println("I am a teacher");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Person p1 = new Student();  
        Person p2 = new Teacher();   

        p1.role();   
        p2.role();  
    }
}