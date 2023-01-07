public class Fibonacci {
    public static int get(int n) {
        return n <= 1 ? n : get(n - 1) + get(n - 2);
    }
}
