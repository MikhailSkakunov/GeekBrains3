package Lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CarBarrier {
    private final CyclicBarrier cyclicBarrier;

    public CarBarrier(int carsCount, Runnable action) {
        this.cyclicBarrier = new CyclicBarrier(carsCount + 1, action);
    }

    public void barrier() {
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
