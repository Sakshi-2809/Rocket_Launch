import java.util.concurrent.CountDownLatch;

class Rocket extends Thread {
    private CountDownLatch latch;

    Rocket(CountDownLatch latch, String name) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println(getName() + " countdown starting...");

            for (int i = 3; i >= 1; i--) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(1000);
            }

            System.out.println(getName() + " Launched!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }
}

public class RocketLaunch {
    public static void main(String[] args) throws InterruptedException {
        int totalRockets = 3;
        CountDownLatch latch = new CountDownLatch(totalRockets);

        Rocket r1 = new Rocket(latch, "Rocket-1");
        Rocket r2 = new Rocket(latch, "Rocket-2");
        Rocket r3 = new Rocket(latch, "Rocket-3");

        r1.start();
        r2.start();
        r3.start();

        latch.await();
        System.out.println("All rockets launched successfully!");
    }
}
