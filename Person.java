public class Person {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public void fullname() {
        System.out.println(lname + ", " + fname);
    }

    public String getFullname() {
        return lname + ", " + fname;
    }
}