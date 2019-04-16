public class EnumDemo { 
    enum Level {
      LOW,
      MEDIUM,
      HIGH
    }
  
    public static void main(String[] args) { 
      Level myVar = Level.LOW; 
      System.out.println(myVar); 
      foo(myVar);

      myVar = Level.MEDIUM; 
      System.out.println(myVar); 
      foo(myVar);

      myVar = Level.HIGH; 
      System.out.println(myVar); 

      // Loop thru enums.
      System.out.println("Levels are:");
      for(Level level : Level.values()) {
          System.out.println("\t" + level);
      }
    }
    
    public static void foo(Level lvl) {
        switch(lvl) {
            case LOW: {
                System.out.println("Low");
                break;
            }
            case MEDIUM: {
                System.out.println("Medium");
                break;
            }
            case HIGH: {
                System.out.println("High");
                break;
            }
        }
    }
  }
