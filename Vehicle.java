class Vehicle{
      protected string brand;
      protected string model;
      protected int year;
      protected string fueltype;
   public Vehicle ( string brand; string model; int year; string fueltype;){
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.fueltype = fueltype;
   }
   public abstract double calculateFuelEfficiency();
   public abstract double getMaxSpeed();
   public double calculateDistanceTraveled(douoble fuelUsed){
      return calculateFuelEfficency() * fuelUsed;
   } 
   public void details{
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
     System.out.println("Fuel Type: " + fuelType);
   }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateFuelEfficiency() {
        return 15.0;
    }
    public double getMaxSpeed() {
        return 180.0; 
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateFuelEfficiency() {
        return 8.0;
    }
    public double getMaxSpeed() {
        return 120.0; 
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateFuelEfficiency() {
        return 35.0; 
    }
    public double getMaxSpeed() {
        return 160.0;
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2022, "Petrol");
        Vehicle truck = new Truck("Volvo", "FH16", 2020, "Diesel");
        Vehicle motorcycle = new Motorcycle("Yamaha", "MT-15", 2023, "Petrol");

        System.out.println("----- Car Info -----");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L fuel: " + car.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h\n");

        System.out.println("----- Truck Info -----");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L fuel: " + truck.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h\n");

        System.out.println("----- Motorcycle Info -----");
        motorcycle.displayInfo();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L fuel: " + motorcycle.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
    }
}
