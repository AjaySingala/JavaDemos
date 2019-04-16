// Java program to illustrate  
// how hashCode() and equals() methods work 
class EqualsAndHashCode { 
    public static void main (String[] args) 
    { 
      
        // creating the Objects of Sample class. 
        Sample s1 = new Sample("aa", 1); 
        Sample s2 = new Sample("aa", 1);
        
        Sample s3 = s1;
        System.out.println("s1 & s3 equal? " + (s3 == s1));
        System.out.println("s1 & s2 equal? " + (s2 == s1));
          
        // comparing above created Objects. 
        if(s1.hashCode() == s2.hashCode()) 
        { 
  
            if(s1.equals(s2)) 
                System.out.println("Both Objects are equal. "); 
            else
                System.out.println("Both Objects are not equal. "); 
      
        } 
        else
        System.out.println("Both Objects are not equal. ");  
    }  
} 
