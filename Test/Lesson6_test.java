import Lesson6.Lesson6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Lesson6_test {
    private Lesson6 homeWorke;

    @BeforeEach
    public void create() {
        homeWorke = new Lesson6();
    }

    @Test
    public void check_4() {
        int[] ar = {1, 2, 3, 5, 6, 4, 3, 2, 1, 0};
        Assertions.assertArrayEquals(new int[] {3, 2, 1, 0}, homeWorke.array(ar));
    }

    @Test
    public void last_4_array() {
        int[] ar = {1, 2, 3, 4};
        Assertions.assertArrayEquals(new int[] {}, homeWorke.array(ar));
    }

    @Test
    public void presence_4_array() {
        int[] ar = {1, 2, 3, 5};
        Assertions.assertThrows(RuntimeException.class, () -> homeWorke.array(ar));
    }

    @Test
    public void presence_array() {
        int[] ar = {};
        Assertions.assertThrows(RuntimeException.class, () -> homeWorke.array(ar));
    }
}
