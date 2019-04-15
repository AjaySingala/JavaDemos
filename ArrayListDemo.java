import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "X5", 5));
        cars.add(new Car("Audi", "Q7", 5));
        cars.add(new Car("Volvo", "S70", 5));
        cars.add(new Car("Testla", "3", 4));

        System.out.println("List of cars...");
        for(Car car: cars) {
            System.out.println(car.Company + ", " + car.Model + ", " + car.NumberOfTyres);
        }
    }
}
