package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        String[] array = {"a", "b", "c", "d", "f"};
        System.out.println(Arrays.toString(array));
        System.out.println();

        transform(arr);
        transform(array);
    }

    public static <T> void transform(T[] array) {
        List<T> x = new ArrayList<>();
        Collections.addAll(x, array);
        System.out.println(x);
    }
}
