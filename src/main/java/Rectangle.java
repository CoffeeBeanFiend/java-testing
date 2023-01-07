public class Rectangle {
    private double sideOne, sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double calculateArea() {
        return sideOne * sideTwo;
    }

    public double calculatePerimeter() {
        return 2 * sideTwo + 2 * sideOne;
    }
}
