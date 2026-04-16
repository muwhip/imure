package ww;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);  
    }

    void drive() {
        System.out.println(brand + " car is driving");
    }
}

public class Inhe{
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.start();  
        c.drive();  
    }
}