package Kindrick;

class Car {
	//Attributes (fields)
	
	private String make;
	private String model;
	private int year;
	
	//Constructor to initialize the attributes
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;	
		this.year = year;
	}
	 //Method to start the car
	public String start() {
		return "The" +year+ ""+make+""+model+"starts.";
	}
	
	//Method to stop the car
	public String stop() {
		return "The" +year+ ""+make+""+model+"starts.";
		
	}

public class Main {
	public static void main(String[] args) {
//Creating instances of the Car class
		Car car1 = new Car("Toyota", "Corolla", 2021);
		Car car2 = new Car("Honda", "Civic", 2021);
		 
		//Using methods of the class
		System.out.println(car1.start());
		System.out.println(car2.stop());
}
	}
}
