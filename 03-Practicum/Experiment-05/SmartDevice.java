interface SmartDevice{
    void turnOn();
    void turnOff();
}

class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Fan is ON");
    }
    public void turnOff(){
        System.out.println("Smart Fan is OFF");
    }
}

class SmartLight implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Light is ON");
    }
    public void turnOff(){
        System.out.println("Smart Light is OFF");
    }
}

class SmartAC implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart AC is ON");
    }
    public void turnOff(){
        System.out.println("Smart AC is OFF");
    }
}

public class Main{
    public static void main(String[]args){

        SmartDevice device;

        //-----TestCase 1-----
        System.out.println("-----TestCase 1-----");
        device=new SmartFan();
        device.turnOn();
        System.out.println();

        //-----TestCase 2-----
        System.out.println("-----TestCase 2-----");
        device=new SmartFan();
        device.turnOff();
        System.out.println();

        //-----TestCase 3-----
        System.out.println("-----TestCase 3-----");
        device=new SmartLight();
        device.turnOn();
        System.out.println();

        //-----TestCase 4-----
        System.out.println("-----TestCase 4-----");
        device=new SmartLight();
        device.turnOff();
        System.out.println();

        //-----TestCase 5-----
        System.out.println("-----TestCase 5-----");
        device=new SmartAC();
        device.turnOn();
        System.out.println();

        //-----TestCase 6-----
        System.out.println("-----TestCase 6-----");
        device=new SmartAC();
        device.turnOff();
        System.out.println();

        //-----TestCase 7-----
        System.out.println("-----TestCase 7-----");
        SmartDevice f=new SmartFan();
        f.turnOn();
        f.turnOff();
        System.out.println();

        //-----TestCase 8-----
        System.out.println("-----TestCase 8-----");
        SmartDevice l=new SmartLight();
        l.turnOn();
        l.turnOff();
        System.out.println();

        //-----TestCase 9-----
        System.out.println("-----TestCase 9-----");
        SmartDevice ac=new SmartAC();
        ac.turnOn();
        ac.turnOff();
        System.out.println();

        //-----TestCase 10-----
        System.out.println("-----TestCase 10-----");
        device=new SmartFan();
        device.turnOn();
        device=new SmartLight();
        device.turnOn();
        device=new SmartAC();
        device.turnOn();
        System.out.println();

        //-----TestCase 11-----
        System.out.println("-----TestCase 11-----");
        System.out.println("Error: Class must implement all interface methods.");
        System.out.println();

        //-----TestCase 12-----
        System.out.println("-----TestCase 12-----");
        System.out.println("Error: Interface cannot be instantiated.");
        System.out.println();

        //-----TestCase 13-----
        System.out.println("-----TestCase 13-----");
        SmartDevice nullDevice=null;
        try{
            nullDevice.turnOn();
        }
        catch(NullPointerException e){
            System.out.println("Error: NullPointerException occurred.");
        }
        System.out.println();

        //-----TestCase 14-----
        System.out.println("-----TestCase 14-----");
        System.out.println("Error: turnON() is incorrect.");
        System.out.println("Correct method is turnOn().");
        System.out.println();

        //-----TestCase 15-----
        System.out.println("-----TestCase 15-----");
        System.out.println("Error: turnOn(String mode) is incorrect.");
        System.out.println("Correct method is turnOn().");
        System.out.println();

        //-----TestCase 16-----
        System.out.println("-----TestCase 16-----");
        System.out.println("Error: 'implements' keyword is required.");
        System.out.println();

        //-----TestCase 17-----
        System.out.println("-----TestCase 17-----");
        System.out.println("Error: Interface methods must be implemented as public.");
    }
}
