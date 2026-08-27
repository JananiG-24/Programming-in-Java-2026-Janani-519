abstract class Vehicle{
    String vehicleNumber;
    String brand;
    Vehicle(String vehicleNumber, String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }
    abstract void startEngine();
    final void showVehicleIdentity(){
        System.out.println("Vehicle Number:"+vehicleNumber);
        System.out.println("Brand:"+brand);
    }
}
class Car extends Vehicle{
    Car(String vehicleNumber,String brand ){
    super(vehicleNumber,brand);
    }
    void startEngine(){
        System.out.println("Car Engine starts with a key/button");
    }
}
class Bike extends Vehicle{
    Bike(String vehicleNumber, String brand){
        super(vehicleNumber,brand);
    }
    void startEngine(){
        System.out.println("Bike engine starts using a self-start/kick");
    }
}
public class Main{
public static void main(String[]args){
    //-----Test case 1-----
  System.out.println("----Testcase 1----");
    Car c1=new Car("KA01AB1234","Toyota");
    c1.showVehicleIdentity();
     System.out.println();
    //-----Test case 2-----
    System.out.println("----Testcase 2----");
    Bike b1=new Bike("KA05XY5678","Honda");
    b1.showVehicleIdentity();
     System.out.println();
    //-----Test case 3-----
    System.out.println("----Testcase 3----");
    //Implimentation of abstract method
    c1.startEngine();
    b1.startEngine();
     System.out.println();
    //-----Test case 4-----
    System.out.println("----Testcase 4----");
    Car c2=new Car("KA12RG6746","Renault");
    c2.showVehicleIdentity();
    Bike b2= new Bike("KA45dh3456","Honda");
    b2.showVehicleIdentity();
     System.out.println();
    //-----Test case 5 constructor initialization
    System.out.println("----Testcase 5----");
    Car c3=new Car("KA09CD9876","Hyundai");
    c3.showVehicleIdentity();
    System.out.println();
    //-----Test case 9-----invalid vehicle Number
    System.out.println("----Testcase 9----");
    Bike b3=new Bike("","Jupiter");
    if(b3.vehicleNumber.isEmpty()){
        System.out.println("Invalid Vehicle Number");
    }
    else{
        b3.showVehicleIdentity();
    }
    System.out.println();
    
    //-----Test case 10-----Empty brand name
    System.out.println("----Testcase 10----");
    Car c4=new Car("KA67HB3478","");
    c4.showVehicleIdentity();
}
}
-----Testcase 6------
public class Main{
public static void main(String[]args){
   //-----Test case 6----object for abstract class
  System.out.println("----Testcase 6----");
   Vehicle v=new Vehicle();
}
}
-----Testcase 7-----
  //Test case 7 car class without startEngine()
  System.out.println("----Testcase 7----");
abstract class Vehicle{
    String vehicleNumber;
    String brand;
    Vehicle(String vehicleNumber, String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }
    abstract void startEngine();
    final void showVehicleIdentity(){
        System.out.println("Vehicle Number:"+vehicleNumber);
        System.out.println("Brand:"+brand);
    }
}
class Car extends Vehicle{
    Car(String vehicleNumber,String brand ){
    super(vehicleNumber,brand);
    }
    
}
class Bike extends Vehicle{
    Bike(String vehicleNumber, String brand){
        super(vehicleNumber,brand);
    }
    void startEngine(){
        System.out.println("Bike engine starts using a self-start/kick");
    }
}
public class Main{
public static void main(String[]args){
   Car c=new Car("KA56DF3425","Toyota");
   
}
}
-----Testcase 8-----
  //Test case 8 final method Override
  System.out.println("----Testcase 8----");
abstract class Vehicle{
    String vehicleNumber;
    String brand;
    Vehicle(String vehicleNumber, String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }
    abstract void startEngine();
    final void showVehicleIdentity(){
        System.out.println("Vehicle Number:"+vehicleNumber);
        System.out.println("Brand:"+brand);
    }
}
class Car extends Vehicle{
    Car(String vehicleNumber,String brand ){
    super(vehicleNumber,brand);
    }
     void startEngine(){
        System.out.println("Car Engine starts");
    }
    void showVehicleIdentity(){
        System.out.println("Vehicle Identity:");
    }
    
}
class Bike extends Vehicle{
    Bike(String vehicleNumber, String brand){
        super(vehicleNumber,brand);
    }
    void startEngine(){
        System.out.println("Bike engine starts using a self-start/kick");
    }
}
public class Main{
public static void main(String[]args){
   Car c=new Car("KA56DF3425","Toyota");
   
}
}
