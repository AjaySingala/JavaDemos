class Car extends Vehicle {
    private String model = "350i";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.Honk();

        System.out.println("Model: " + myCar.model + " brand = " + myCar.brand);
    }
}