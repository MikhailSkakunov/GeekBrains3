package Lesson5;

import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {

    private static int CARS_COUNT;
    private static final AtomicBoolean winner = new AtomicBoolean(false);
    private final Race race;
    private final int speed;
    private final String name;
    private final FinishCars finishCars;
    private final CarBarrier carBarrier;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, FinishCars finishCars, CarBarrier carBarrier) {
        this.race = race;
        this.speed = speed;
        this.finishCars = finishCars;
        this.carBarrier = carBarrier;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            carBarrier.barrier();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if (!winner.getAndSet(true))
            System.out.println(this.name + " - WINNER!!!");
        finishCars.finishAllCars();
    }
}