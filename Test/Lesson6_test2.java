import Lesson6.Lesson6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Lesson6_test2 {

    private Lesson6 homeWorke;

    @BeforeEach
    public void create() {
        homeWorke = new Lesson6();
    }

    @Test
    public void no_value_4() {
        int[] ar = {4, 4, 1};
        Assertions.assertTrue(homeWorke.a(ar));
    }

    @Test
    public void no_value_1() {
        int[] arr = {1, 4, 4};
        Assertions.assertTrue(homeWorke.a(arr));
    }

    @Test
    public void value_is() {
        int[] arr = {4, 2, 1};
        Assertions.assertFalse(homeWorke.a(arr));
    }

    @Test
    public void value_is_1() {
        int[] arr = {1, 1, 1, 1};
        Assertions.assertFalse(homeWorke.a(arr));
    }

    @Test
    public void value_is_4() {
        int[] arr = {4, 4, 4, 4, 4};
        Assertions.assertFalse(homeWorke.a(arr));
    }





}
