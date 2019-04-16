// Java code for Bill Pugh Singleton Implementation. Preferred!
class BPS  
{ 
  public String name;

  private BPS()  
  { 
    // private constructor 
  } 
  
  // Inner class to provide instance of class 
  private static class BillPughSingleton 
  { 
    private static final BPS INSTANCE = new BPS(); 
  } 
  
  public static BPS getInstance()  
  { 
    return BillPughSingleton.INSTANCE; 
  } 
} 


class Demo3 {
    public static void main(String[] args) {
        BPS bps1 = BPS.getInstance();
        bps1.name = "John";
        System.out.println("bps1: " + bps1.name);

        BPS bps2 = BPS.getInstance();
        bps2.name = "Mary";

        System.out.println("bps2: " + bps2.name);
        System.out.println("bps1: " + bps1.name);
    }
}
