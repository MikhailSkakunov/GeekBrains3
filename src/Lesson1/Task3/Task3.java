package Lesson1.Task3;

public class Task3 {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Вес коробки с яблоками составляет: " + appleBox.getWeight());


        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println("Вес коробки с аельсинами составляет: " + orangeBox.getWeight());

        Box<Orange> anotherOrangeBox = new Box<>();
        anotherOrangeBox.addFruit(new Orange());
        anotherOrangeBox.addFruit(new Orange());

        anotherOrangeBox.transferToBox(orangeBox);
        System.out.println("Вес коробки с аельсинами составляет: " + orangeBox.getWeight());


        System.out.println("Вес коробок разный, если -fals- и одинаковый если -true- : " + appleBox.compare(orangeBox));
        System.out.println("Вес коробок разный, если -fals- и одинаковый если -true- : " + appleBox.compare(anotherOrangeBox));

    }
}
