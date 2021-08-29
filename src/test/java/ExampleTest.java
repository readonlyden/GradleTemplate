import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    void shouldVerifyBasicMath() {
        int first = 2;
        int second = 2;

        int result = first + second;

        Assertions.assertEquals(4, result);
    }
}
