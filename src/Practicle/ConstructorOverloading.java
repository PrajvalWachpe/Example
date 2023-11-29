package Practicle;

public class ConstructorOverloading {

	public static class Vehicle {
	    private String make;
	    private String model;
	    private int year;

	  
	    public Vehicle() {
	        this.make = "Unknown";
	        this.model = "Unknown";
	        this.year = 0;
	    }

	    public Vehicle(String make, String model) {
	        this.make = make;
	        this.model = model;
	        this.year = 0;
	    }

	    public Vehicle(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void displayInfo() {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camry");
        Vehicle vehicle3 = new Vehicle("Honda", "Civic", 2022);

   
        System.out.println("Vehicle 1 Information:");
        vehicle1.displayInfo();

        System.out.println("\nVehicle 2 Information:");
        vehicle2.displayInfo();

        System.out.println("\nVehicle 3 Information:");
        vehicle3.displayInfo();

		}
	}
}
