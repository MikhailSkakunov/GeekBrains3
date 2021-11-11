package Lesson5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        FinishCars finishCars = new FinishCars(CARS_COUNT);

        Runnable action = () -> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        CarBarrier cyclicBarrier = new CarBarrier(CARS_COUNT, action);

        ExecutorService service = Executors.newFixedThreadPool(CARS_COUNT);


        Race race = new Race(new Road(60), new Tunnel(CARS_COUNT), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), finishCars, cyclicBarrier);
        }

        for (Car c : cars) {
            service.execute(c);
        }
        cyclicBarrier.barrier();
        finishCars.finishCar();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

        service.shutdown();
    }
}



