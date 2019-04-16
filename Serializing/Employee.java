import java.io.Serializable;

//public class Employee {
public class Employee implements Serializable {
        //private static final long serialVersionUID = 1L;
    public int Id;
    public String Firstname;
    public String Lastname;
    public String City;
    //public int SSN;           // Serialized.
    public transient int SSN;   // Not serialized.

    public String Fullname() {
        return this.Lastname + ", " + this.Firstname;
    }
}
