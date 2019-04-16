public class IsAliveDemo extends Thread {
    private int time;
    public IsAliveDemo(int n) {
        time = n;
    }
    public void run() {
        System.out.println(this.getName() + " r1 ");
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException ie) {
        }
        System.out.println(this.getName() + " r2 ");
    }

    public static void main(String[] args) {
        IsAliveDemo t1 = new IsAliveDemo(10);
        IsAliveDemo t2 = new IsAliveDemo(50);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {
            System.out.println(t1.getName() + " is alive: " + t1.isAlive());
            System.out.println(t2.getName() + " is alive: " + t2.isAlive());
        }
    }
}