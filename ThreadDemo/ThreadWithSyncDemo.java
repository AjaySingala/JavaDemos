class PrintDemo2 {
   public void printCount(String name) {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println(name + " Counter   ---   "  + i );
         }
      } catch (Exception e) {
         System.out.println("Thread  interrupted.");
      }
   }
}

class TheadDemo2 extends Thread {
   private Thread t;
   private String threadName;
   PrintDemo2  PD;

   TheadDemo2( String name,  PrintDemo2 pd) {
      threadName = name;
      PD = pd;
   }
   
   public void run() {
      synchronized(PD) {
         PD.printCount(this.getName());
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }

   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class ThreadWithSyncDemo {

   public static void main(String args[]) {
      PrintDemo2 PD = new PrintDemo2();

      TheadDemo2 T1 = new TheadDemo2( "Thread - 1 ", PD );
      TheadDemo2 T2 = new TheadDemo2( "Thread - 2 ", PD );

      T1.start();
      T2.start();

      // wait for threads to end
      try {
         T1.join();
         T2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}
