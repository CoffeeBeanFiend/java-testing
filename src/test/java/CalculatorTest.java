import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        assertThat(new Calculator().add(5).getResult()).isEqualTo(5);
        assertThat(new Calculator().add(5).add(5).getResult()).isEqualTo(10);
        assertThat(new Calculator().add(5).add(4).add(3).getResult()).isEqualTo(12);
    }

    @Test
    void sub() {
        assertThat(new Calculator().sub(5).getResult()).isEqualTo(-5);
        assertThat(new Calculator().sub(5).sub(5).getResult()).isEqualTo(-10);
        assertThat(new Calculator().sub(5).sub(4).sub(3).getResult()).isEqualTo(-12);
    }

    @Test
    void mul() {
        assertThat(new Calculator().mul(5).getResult()).isEqualTo(0);
        assertThat(new Calculator().set(1).mul(5).getResult()).isEqualTo(5);
        assertThat(new Calculator().set(1).mul(-5).mul(5).getResult()).isEqualTo(-25);
        assertThat(new Calculator().set(1).mul(-5).mul(-5).getResult()).isEqualTo(25);
        assertThat(new Calculator().set(1).mul(5).mul(5).getResult()).isEqualTo(25);
        assertThat(new Calculator().set(1).mul(5).mul(4).mul(3).getResult()).isEqualTo(60);
    }

    @Test
    void div() {
        assertThat(new Calculator().set(10).div(2).getResult()).isEqualTo(5);
        assertThat(new Calculator().set(10).div(5).getResult()).isEqualTo(2);
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {
            new Calculator().set(10).div(0).getResult();
        });
    }
}