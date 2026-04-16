package twoobject;
//class
public class Car {
	String brand;
	int speed;
	String color;
	void showCar() {
		System.out.println("Brand :" + brand);
		System.out.println("Speed :" + speed + "km/h");
		System.out.println("Color :" + color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car c1 = new Car();
	c1.brand="Toyota";
	c1.speed= 100;
	c1.color="blue";
	Car c2 = new Car();
	c2.brand= "BMW";
	c2.speed= 120;
	c2.color="red";
	c1.showCar();
	c2.showCar();
			}

}