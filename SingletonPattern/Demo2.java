// Java code to create singleton class Using Lazy Initialization.
/*
Pros:
    Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
    Exception handling is also possible in method.
Cons:
    Every time a condition of null has to be checked.
    instance can’t be accessed directly.
    In multithreaded environment, it may break singleton property.
*/

class LZ {
    public String name;

    // private instance. Can be public too.
    private static LZ instance;

    private LZ() {
        // private constructor
    }

    // method to return instance of class
    public static LZ getInstance() {
        if (instance == null) {
            // if instance is null, initialize
            instance = new LZ();
        }
        return instance;
    }
}

class Demo2 {
    public static void main(String[] args) {
        LZ lz1 = LZ.getInstance();
        lz1.name = "John";
        System.out.println("lz1: " + lz1.name);

        LZ lz2 = LZ.getInstance();
        lz2.name = "Mary";

        System.out.println("lz2: " + lz2.name);
        System.out.println("lz1: " + lz1.name);
    }
}