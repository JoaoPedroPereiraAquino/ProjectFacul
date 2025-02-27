public class DependencyInversion_Resolvida {
    public static void main(String[] args) {
        Device bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);

        lightSwitch.turnOn();
        lightSwitch.turnOff();
    }
}


interface Device {
    void turnOn();
    void turnOff();
}


class LightBulb implements Device {
    
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    
    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}


class Switch {
    private final Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
