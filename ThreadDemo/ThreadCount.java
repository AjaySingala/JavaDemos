class ThreadCount {
    public static void main(String args[]) {
        Count count = new Count();
        int x = 0;
        try {
            while (count.isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
                x++;
                if(x >= 4) {
                    count.interrupt();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");
    }
}