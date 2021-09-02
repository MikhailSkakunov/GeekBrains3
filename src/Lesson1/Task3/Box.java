package Lesson1.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <E extends Fruit> {
    private List<E> fruits = new ArrayList<>();

    public double getWeight() {
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public Box() {
        this.fruits.addAll(fruits);
    }
    public Box(E fruits) {
        this.fruits.addAll(List.of(fruits));
    }

    public void transferToBox(Box<E> anotherBox) {
        for (E fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }

    public void addFruit(E fruit) {
        fruits.add(fruit);
    }

}
