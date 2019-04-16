class MultithreadEDemo {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < 8; i++) {
            Thread object = new Thread(new MultithreadingExtendsDemo());
            object.start();
        }
    }
}
