package Lesson5;

import java.util.concurrent.CountDownLatch;

public class FinishCars {
    private final CountDownLatch countDownLatch;

    public FinishCars(int carsCount) {
        this.countDownLatch = new CountDownLatch(carsCount);
    }
    public void finishCar() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void finishAllCars() {
        countDownLatch.countDown();
    }
}
