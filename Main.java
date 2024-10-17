public class Main {
    public static void main(String[] args) {
        RightTriangle newTriangle = new RightTriangle(3.0, 4.0);
        RightTriangle newTriangle2 = new RightTriangle(6.5, 10.7);
        double hyp1 = newTriangle.hypotenuse();
        double hyp2 = newTriangle2.hypotenuse();
        System.out.println(hyp1);
        System.out.println(hyp2);
    }
}