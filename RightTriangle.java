public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double b, double h) {
        base = b;
        height = h;
    }
    public double hypotenuse() {
        double sumOfSquares = Math.pow(base, 2) + Math.pow(height, 2);
        return Math.sqrt(sumOfSquares);
    }
}
