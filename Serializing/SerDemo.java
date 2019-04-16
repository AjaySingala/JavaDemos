import java.io.*;

class SerDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.Id = 101;
        emp.Firstname = "John";
        emp.Lastname = "Smith";
        emp.City = "Dallas";
        emp.SSN = 111222333;

        Serialize(emp);
        DeSerialize();

    }

    public static void Serialize(Employee emp) {
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void DeSerialize() {
        Employee e = null;
        try {
           FileInputStream fileIn = new FileInputStream("employee.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           e = (Employee) in.readObject();
           in.close();
           fileIn.close();
        } catch (IOException i) {
           i.printStackTrace();
           return;
        } catch (ClassNotFoundException c) {
           System.out.println("Employee class not found");
           c.printStackTrace();
           return;
        }
        
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.Fullname());
        System.out.println("City: " + e.City);
        System.out.println("SSN: " + e.SSN);
        System.out.println("ID: " + e.Id);
    }
}