package dayfour;

public class Car {
    // Properties (fields) of the class
    String brand;
    String model;
    int year;

    //Defult constructor
    public Car() {
        brand = "Not Specified";
        model = "Unknown";
        year = 2000;
    }
    //Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Override to String() method to return a string representation
    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", year=" + year + '}';
    }

}
