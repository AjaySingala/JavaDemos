public class MyThread {
    public static void main(String args[]) {
        //TestThreadRunnable();
        TestThreadExtendThread();
    }

    public static void TestThreadRunnable() {
        System.out.println("Sample where class implements Runnable.");
        ThreadRunnable R1 = new ThreadRunnable("Thread-1");

        R1.start();

        ThreadRunnable R2 = new ThreadRunnable("Thread-2");
        R2.start();

    }

    public static void TestThreadExtendThread() {
        System.out.println();
        System.out.println("Sample where class extends Thread.");
        ThreadExtendThread R1 = new ThreadExtendThread("Thread-1");
        System.out.println("Created thread " + R1.getName());
        R1.start();

        ThreadExtendThread R2 = new ThreadExtendThread("Thread-2");
        System.out.println("Created thread " + R2.getName());
        R2.setName("Thread-2.1");
        R2.start();
    }
}
