public class ThreadWithJoin extends Thread {
    public void run() {
        System.out.println(this.getName() + " r1 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println(this.getName() + " r2 ");
    }

    public static void main(String[] args) {
        ThreadWithJoin t1 = new ThreadWithJoin();
        ThreadWithJoin t2 = new ThreadWithJoin();
        t1.start();

        try {
            t1.join(); // Waiting for t1 to finish
        } catch (InterruptedException ie) {
        }

        t2.start();
    }
}