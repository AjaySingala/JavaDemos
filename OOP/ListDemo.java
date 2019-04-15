import java.util.ArrayList;
import java.util.List;

class ListDemo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Pig());
        animals.add(new Dog());
        animals.add(new Wolf());

        //anmials.add(new Mouse());   // Won't work as Mouse is of type Animal class.
        
        AnimalFeeder af = new AnimalFeeder();
        af.feed(animals);

    }
}

class AnimalFeeder {
    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.animalSound();
        });
    }
}
