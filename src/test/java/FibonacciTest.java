import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FibonacciTest {
    @Test
    public void get() {
        assertThat(Fibonacci.get(0)).isEqualTo(0);
        assertThat(Fibonacci.get(1)).isEqualTo(1);
        assertThat(Fibonacci.get(2)).isEqualTo(1);
        assertThat(Fibonacci.get(3)).isEqualTo(2);
        assertThat(Fibonacci.get(4)).isEqualTo(3);
        assertThat(Fibonacci.get(5)).isEqualTo(5);
        assertThat(Fibonacci.get(6)).isEqualTo(8);
        assertThat(Fibonacci.get(7)).isEqualTo(13);
        assertThat(Fibonacci.get(8)).isEqualTo(21);
        assertThat(Fibonacci.get(9)).isEqualTo(34);
    }
}