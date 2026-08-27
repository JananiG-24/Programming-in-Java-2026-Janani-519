interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

class Fan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class AirConditioner implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Interface reference demonstrating runtime polymorphism
        SmartDevice device;

        device = new Light();
        device.turnOn();
        device.turnOff();

        device = new Fan();
        device.turnOn();
        device.turnOff();

        device = new AirConditioner();
        device.turnOn();
        device.turnOff();
    }
}
