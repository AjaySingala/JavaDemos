class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();

        Wolf wolf = new Wolf();
        wolf.animalSound();

        Dog dogOrWolf = new Wolf();
        System.out.println("Dog or Wolf?");
        dogOrWolf.animalSound();

        //Wolf dogOrWolf2 = new Dog();  // Won't work.

        System.out.println("Polymorphism in action!");
        Animal what = new Pig();
        System.out.println(pig.name);
        System.out.println(((Pig)what).name);   // Error!

        // Abstract demo.
        System.out.println("Abstract demo");
        //AnotherAnimal anotherAnimal = new AnotherAnimal();  // Won't work!
        Cow cow = new Cow();
        cow.animalSound();

        // Interface demo
        System.out.println("Interface demo");
        //IAnimal iAnimal = new IAnimal();    // Not allowed.
        Mouse mouse = new Mouse();
        mouse.animalSound();
        mouse.sleep();
    }
}

class Animal {
    public void animalSound() {
        System.out.println("Sound of an animal");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("oink! oink!");
    }

    public String name = "Porky";
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Woof! Woof!");
    }
}

class Wolf extends Dog {
    @Override
    public void animalSound() {
        System.out.println("Owoooooooooo!");
    }
}

abstract class AnotherAnimal {
    abstract void animalSound();
    public void sleep() {
        System.out.println("zzzzz");
    }
}

class Cow extends AnotherAnimal {
    //@Override
    public void animalSound() {
        System.out.println("Moooooo!");
    }
}

interface IAnimal {
    public void animalSound();
    public void sleep();
}

class Mouse implements IAnimal {
    public void animalSound() {
        System.out.println("Squeak! Squeak");
    }

    public void sleep() {
        System.out.println("Really?");
    }
}