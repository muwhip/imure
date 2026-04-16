package mm;


class Person {
    void display() {
        System.out.println("This is a person");
    }
}


class Student extends Person {
    void show() {
        System.out.println("This is a student");
    }
}


public class inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.show();
    }
}