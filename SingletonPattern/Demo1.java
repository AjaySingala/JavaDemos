// Java code to create singleton class by Eager Initialization 
/*
Pros:
    Very simple to implement.
    No need to implement getInstance() method. Instance can be accessed directly.
Cons:
    May lead to resource wastage. Because instance of class is created always, whether it is required or not.
    CPU time is also wasted in creation of instance if it is not required.
    Exception handling is not possible.
*/
class Eager {

    public String name = "John";

    // public instance initialized when loading the class
    public static Eager instance = new Eager();

    private Eager() {
        // private constructor
    }
}

class Demo1 {
    public static void main(String[] args) {
        System.out.println(Eager.instance.name);
    }
}