public class ThreadNoJoin extends Thread {
    public void run() {
        System.out.println(this.getName() + " r1 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println(this.getName() + " r2 ");
    }

    public static void main(String[] args) {
        ThreadNoJoin t1 = new ThreadNoJoin();
        ThreadNoJoin t2 = new ThreadNoJoin();
        t1.start();
        t2.start();
    }
}