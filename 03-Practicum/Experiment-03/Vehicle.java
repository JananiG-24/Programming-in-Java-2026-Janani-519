abstract class Vehicle {

    String vehicleNumber;
    String brand;

    Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    
    abstract void startEngine();

    
    final void showVehicleIdentity() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}


class Car extends Vehicle {

    Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key.");
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    
    @Override
    void startEngine() {
        System.out.println("Bike engine starts with a self-start button.");
    }
}


public class Main {

    public static void main(String[] args) {

       
        System.out.println("TEST CASE 1");
        Car car = new Car("KA01AB1234", "Toyota");
        car.showVehicleIdentity();

        System.out.println();

        System.out.println("TEST CASE 2");
        Bike bike = new Bike("KA05XY5678", "Honda");
        bike.showVehicleIdentity();

        System.out.println();

        
        System.out.println("TEST CASE 3");
        car.startEngine();
        bike.startEngine();

        System.out.println();

        
        System.out.println("TEST CASE 4");
        car.showVehicleIdentity();
        bike.showVehicleIdentity();

        System.out.println();

       
        System.out.println("TEST CASE 5");
        Car car2 = new Car("KA09CD9876", "Hyundai");
        car2.showVehicleIdentity();

        System.out.println();

        
        System.out.println("TEST CASE 9");
        Car invalidVehicle = new Car("", "Toyota");

        if (invalidVehicle.vehicleNumber.isEmpty()) {
            System.out.println("Invalid Vehicle Number");
        } else {
            invalidVehicle.showVehicleIdentity();
        }

        System.out.println();

        System.out.println("TEST CASE 10");
        Bike emptyBrand = new Bike("KA01AB1234", "");

        if (emptyBrand.brand.isEmpty()) {
            System.out.println("Brand name cannot be empty");
        } else {
            emptyBrand.showVehicleIdentity();
        }
    }
}
