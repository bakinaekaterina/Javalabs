public class Main extends Thread {
    private boolean f;
    public Main(boolean f) {
        this.f=f;
    }
    @Override
    public void run() {
        if (f) System.out.println("Ping");
        else System.out.println("Pong");
    }

    public static void main(String[] args) throws InterruptedException {
        while (true){
            Main thread1 = new Main(true);
            Main thread2 = new Main(false);
            thread1.start();
            Main.sleep(1000);
            thread2.start();
            Main.sleep(1000);
        }
    }
}