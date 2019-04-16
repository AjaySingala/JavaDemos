import java.util.*;

public class CompareDemo {

    public static void main(String args[]) {
       // Takes a list o Dog objects
       List<Dog> list = new ArrayList<Dog>();
 
       list.add(new Dog("Shaggy", 3));
       list.add(new Dog("Lacy", 2));
       list.add(new Dog("Roger", 10));
       list.add(new Dog("Tommy", 4));
       list.add(new Dog("Tammy", 1));
       Collections.sort(list);   // Sorts the array list
 
       for(Dog a: list)   // printing the sorted list of names
          System.out.print(a.getDogName() + ", ");
 
       // Sorts the array list using comparator
       Collections.sort(list, new Dog());
       System.out.println(" ");
       
       for(Dog a: list)   // printing the sorted list of ages
          System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");

        // Compare 2 Dog objects.
        System.out.println();
        Dog d1 = new Dog("Max", 4);
        Dog d2 = new Dog("Max", 4);
        System.out.println("d1: " + d1.getDogName() + " d2: " + d2.getDogName());
        System.out.println("Same: " + d1.compareTo(d2));

        d2 = new Dog("Tommy", 4);
        System.out.println("d1: " + d1.getDogName() + " d2: " + d2.getDogName());
        System.out.println("Same: " + d1.compareTo(d2));

        d2 = new Dog("Anto", 4);
        System.out.println("d1: " + d1.getDogName() + " d2: " + d2.getDogName());
        System.out.println("Same: " + d1.compareTo(d2));
    }
 }
