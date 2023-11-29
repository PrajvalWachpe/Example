package Practicle;

public class Car1 {

	private int carId;
    private String engineType;
    private String color;
    private String brand;

    // Constructor
    public Car1(int carId, String engineType, String color, String brand) {
        this.carId = carId;
        this.engineType = engineType;
        this.color = color;
        this.brand = brand;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String toString() {
        return "Car [\ncarId=" + carId + ",\n engineType=" + engineType + ",\n color=" + color + ",\n brand=" + brand + "]";
    }

	public static void main(String[] args) {
		
		Car1 car = new Car1(1, "Gasoline", "Blue", "Toyota");

        System.out.println(car);
	}

}
