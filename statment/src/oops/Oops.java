package oops;

public class Oops {
	String Name;
	int age;
	void display() {
		System.out.println("name: "+ Name);
		System.out.println("age: "+ age);
	}
	public static void main(String[]args)  {
		 Oops s1 = new Oops();
		s1.Name = "Mr Ciise";
		s1.age = 15;
		s1.display();
	}
	
	}


