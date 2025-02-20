public class DependencyInversionRefactored {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine(); // Pode ser substituído por outra implementação
        Car car = new Car(engine);
        car.start();
    }
}

// Interface para abstrair o conceito de motor
interface Engine {
    void start();
}

// Implementação específica de motor a combustão
class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

// Implementação específica de motor elétrico
class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric Engine started");
    }
}

// Classe Car agora depende da abstração Engine, e não de uma implementação concreta
class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is running");
    }
}
