package Lesson1;

import java.util.Arrays;

public class Task1 {
        public static void main(String[] args) {
            Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6};
            System.out.println(Arrays.toString(arr));
            String[] str = new String[]{"a", "b", "c", "d"};
            System.out.println(Arrays.toString(str));

            swap(arr);
            swap(str);
            print(arr);
            System.out.println();
            print(str);

        }

        public static <T> void swap(T[] arr) {
            T temp;
            for (int i = 0; i < arr.length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        private static void print(Object[] arr) {
            for (Object o : arr) {
                System.out.print(o + " ");
            }
        }
    }
