public class Wrapper {

    public static void main(String args[]) {
       Integer x = 5; // boxes int to an Integer object
       x =  x + 10;   // unboxes the Integer to a int
       System.out.println(x); 

       System.out.println(x.floatValue());
       System.out.println(x.compareTo(5));
       System.out.println(x.compareTo(15));
       System.out.println(x.compareTo(25));
       System.out.println(x.equals(15));
    }
 }
