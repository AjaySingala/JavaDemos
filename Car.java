// Create a Car class
public class Car {
    String Company;
    String Model;
    int NumberOfTyres;

    public Car() {
        super();
    }

    public Car(String company, String model, int tyres) {
        Company = company;
        Model = model;
        NumberOfTyres = tyres;
    }

    public void start() {
        System.out.println("The car is starting...");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}