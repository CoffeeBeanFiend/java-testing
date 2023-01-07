public class Calculator {
    protected int result = 0;

    public Calculator set(int x) {
        result = x;
        return this;
    }

    public Calculator add(int x) {
        result += x;
        return this;
    }

    public Calculator sub(int x) {
        result -= x;
        return this;
    }

    public Calculator mul(int x) {
        result *= x;
        return this;
    }

    public Calculator div(int x) {
        result /= x;
        return this;
    }

    public int getResult() {
        return this.result;
    }
}
