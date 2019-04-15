public class MyClass {
    int x = 50;
    final int y = 100;

    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "John";
        System.out.println("Hello " + name);

        // primitiveTypes();
        nonPrimitiveTypes();
        // math();
        // arrays();
        // trycatch();

        // person();
        //car();
    }

    public static void car() {
        Car myCar = new Car(); // Create a myCar object
        myCar.start();
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.speed(200); // Call the speed() method
        
        Car[] cars = new Car[3];
        cars[0] = new Car("BMW", "X5", 4);
        cars[1] = new Car("Audi", "Q7", 4);
        cars[2] = new Car("Volvo", "S70", 4);

        System.out.println("List of cars using 'for-each' loop...");
        for(Car car: cars) {
            System.out.println(car.Company + ", " + car.Model + ", " + car.NumberOfTyres);
        }
    }

    public static void person() {
        Person myObj = new Person();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

        myObj.fullname();
        String fullname = myObj.getFullname();
        System.out.println(fullname);

    }

    private static void trycatch() {
        int[] myNumbers = { 1, 2, 3 };
        // System.out.println(myNumbers[10]); // error!

        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        checkAge(15);
        checkAge(45);
    }

    private static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    private static void arrays() {
        String[] cars = { "BMW", "Audi", "Volvo", "Ford", "Subaru" };
        System.out.println(cars[0]);
        System.out.println(cars[3]);

        System.out.println("Using 'for(String i: cars')");
        for(String car: cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car : cars) {
            System.out.println(car);
        }

        cars[0] = "Chevy";
        System.out.println(cars[0]);

        // multi-dim array.
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        // nested loops for multi-dim array.
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("i=" + i + ", j=" + j + ". value=" + myNumbers[i][j]);
            }
        }
    }

    private static void math() {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7)); // positive value.
        System.out.println(Math.random()); // b/w 0 and 1.
    }

    private static void nonPrimitiveTypes() {
        // Non-primitive types are Strings, Arrays, Classes, Interface, etc.
        // Primitive types are predefined (already defined) in Java.
        // Non-primitive types are created by the programmer and is not
        // defined by Java (except for String).
        // Non-primitive types can be used to call methods to perform certain
        // operations,
        // while primitive types cannot.
        // A primitive type has always a value, while non-primitve types can be null.
        // A primitive type starts with a lowercase letter, while non-primitive types
        // starts with an uppercase letter.
        // Non-primitive data types are called reference types because
        // they refer to objects.

        // Quotes inside a string.
        String txt1 = "It's alright";
        String txt2 = "That's great";
        System.out.println(txt1 + "...." + txt2);
        
        // String functions.
        // length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = txt.length();
        System.out.println(txt);
        System.out.println("The length of the txt string is: " + len);

        // change case
        String atxt = "Hello World";
        System.out.println(atxt.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(atxt.toLowerCase()); // Outputs "hello world"

        // find a string within another string
        String btxt = "Please locate where 'locate' occurs!";
        System.out.println(btxt);
        System.out.println(btxt.indexOf("locate")); // Outputs 7

        // lastIndexOf.
        System.out.println("last Index Of 'locate' is: " + btxt.lastIndexOf("locate"));

        // substring.
        String ctxt = "This is a demo for substring().";
        String cresult = ctxt.substring(10,14);
        System.out.println("Substring: " + cresult);

        // charAt.
        System.out.println("The char at position 5 is: " + ctxt.charAt(5));

        // concat
        // 2 strings.
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        // concat 2 numbers in strings
        String xx = "10";
        String yy = "20";
        String zz = xx + yy; // zz will be 1020 (a String)
        System.out.println(zz);

        // equals.
        String cmp = "Compare";
        System.out.println(cmp);
        System.out.println(cmp.equals("Compare"));
        System.out.println(cmp.equals("compare"));
        System.out.println(cmp.equals("COMPARE"));
        System.out.println("Compare ignore case...");
        System.out.println(cmp.equalsIgnoreCase("Compare"));
        System.out.println(cmp.equalsIgnoreCase("compare"));
        System.out.println(cmp.equalsIgnoreCase("COMPARE"));
        // compareToIgnoreCase: returns an int diff b/w 2 strings.
        System.out.println(cmp.compareToIgnoreCase("COMPARE"));
        System.out.println(cmp.compareToIgnoreCase("aCompare"));
        System.out.println(cmp.compareToIgnoreCase("fCompare"));
        
        // compareTo: returns an int diff b/w 2 strings.
        System.out.println(cmp.compareTo("ACompare"));
        System.out.println(cmp.compareTo("FCompare"));
        System.out.println(cmp.compareTo("aCompare"));
        System.out.println(cmp.compareTo("fCompare"));

        // concat a string and a number.
        int num = 10;
        zz = num + xx;
        System.out.println(zz);
        zz = xx + num;
        System.out.println(zz);

        // toUpperCase, toLowerCase, trim
        String caseTest = "    The sly fox jumped over the fence    ";
        System.out.println(caseTest);
        System.out.println(caseTest.toUpperCase());
        System.out.println(caseTest.toLowerCase());
        System.out.println(caseTest.trim());

        // replace.
        String geeks = "FeeksforFeeks";
        System.out.println(geeks);
        System.out.println(geeks.replace('F', 'G'));

        // StringBuilder.
        System.out.println("StringBuilder...");
        StringBuilder sb = new StringBuilder();
        sb.append("First line.");
        System.out.println(sb.toString() + " Capacity: " + sb.capacity());
        sb.append("Second line.");
        System.out.println(sb.toString() + " Capacity: " + sb.capacity());
        System.out.println(sb.reverse());
        System.out.println(sb.replace(4, 10, "ABC"));

        // StringBuffer.
        System.out.println("StringBuffer...");
        StringBuffer sbf1 = new StringBuffer();     // Default 16 chars.
        StringBuffer sbf2 = new StringBuffer(20);
        StringBuffer sbf3 = new StringBuffer("This is a test");
        System.out.println(sbf1 + ". Length: " + sbf1.length() + ". Capacity: " + sbf1.capacity());
        System.out.println(sbf2 + ". Length: " + sbf2.length() + ". Capacity: " + sbf2.capacity());
        System.out.println(sbf3 + ". Length: " + sbf3.length() + ". Capacity: " + sbf3.capacity());
        sbf1.append(" Hello 1");
        sbf2.append(" Hello 2");
        sbf3.append(" Hello 3");
        System.out.println(sbf1 + ". Length: " + sbf1.length() + ". Capacity: " + sbf1.capacity());
        System.out.println(sbf2 + ". Length: " + sbf2.length() + ". Capacity: " + sbf2.capacity());
        System.out.println(sbf3 + ". Length: " + sbf3.length() + ". Capacity: " + sbf3.capacity());
        // insert.
        sbf3.insert(3, "Third");
        System.out.println(sbf3 + ". Length: " + sbf3.length() + ". Capacity: " + sbf3.capacity());
        sbf3.insert(10, 'X');
        System.out.println(sbf3 + ". Length: " + sbf3.length() + ". Capacity: " + sbf3.capacity());
        System.out.println(sbf3.reverse());
        sbf3.reverse();
        // delete.
        sbf3.delete(3, 8);
        System.out.println(sbf3);
        sbf3.deleteCharAt(5);
        System.out.println(sbf3);
        // replace.
        sbf3.replace(5, 7, "was");
        System.out.println(sbf3);

        // An array of chars is a string.
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);

    }

    private static void primitiveTypes() {
        // Primitive Data Types.
        // A primitive data type specifies the size and type of variable values,
        // and it has no additional methods.
        // Primitive types are predefined (already defined) in Java.
        // Non-primitive types are created by the programmer and is not
        // defined by Java (except for String).
        // There are eight primitive data types in Java:
        int myNum = 10; // 4 bytes. Whole nums -2,147,483,648 to 2,147,483,647.
        int anotherNum = 20;
        System.out.println(myNum + anotherNum);

        float myFloat = 5.99f; // 4 bytes. Fractionals 3.4e−038 to 3.4e+038.
        System.out.println(myFloat);// Sufficient for storing 6 to 7 decimal digits.

        char myLetter = 'A'; // 2 bytes. Single char.
        System.out.println(myLetter);

        char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean myBool = true; // 1 byte.
        System.out.println(myBool);

        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z);

        byte myByte = 100; // 1 byte. Whole numbers -128 to 127.
        System.out.println(myByte);

        short myShort = 1000; // 2 bytes. Whole numbers -32,768 to 32,767.
        System.out.println(myShort);

        long myLong = 854775808; // 8 bytes. Whole numbers -9,223,372,036,854,775,808
        System.out.println(myLong); // to 9,223,372,036,854,775,808.

        double myDouble = 854775808; // 8 bytes. Fractionals 3.4e−038 to 3.4e+038.
        System.out.println(myDouble); // Sufficient for storing 15 decimal digits.
    }
}
