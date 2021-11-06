package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static int[] array (int[] ar) {

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == 4) {
                return Arrays.copyOfRange(ar, i + 1, ar.length);
            }
        }
        throw new RuntimeException("No value in the array");
    }

    public static boolean a (int[] array) {
        boolean _1 = false;
        boolean _4 = false;
        for (int i : array) {
            switch (i) {
                case 1: _1 = true; break;
                case 4: _4 = true; break;
                default: return false;
            }
        }
        return _1 && _4;
    }
}
