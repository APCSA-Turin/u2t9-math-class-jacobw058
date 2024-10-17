import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your starting number: ");
        int init = scan.nextInt();
        System.out.println("Enter your modifier number: ");
        int modifier = scan.nextInt();
        System.out.println("Try to make your starting number equal 1001!");
        int num = init;
        while (num > 1001 || num < 1001) {
            System.out.println("Choose between *, /, +, -, ^, sin, or cos: ");
            String math = scan.nextLine();
            if (math.equals("*")) {
                num = num * modifier;
            } else if (math.equals("/")) {
                num = num / modifier;
            } else if (math.equals("+")) {
                num = num + modifier;
            } else if (math.equals("-")) {
                num = num - modifier;
            } else if (math.equals("^")) {
                num = (int) Math.pow(num, modifier);
            } else if (math.equals("sin")) {
                num = (int) Math.sin(num);
            } else if (math.equals("cos")) {
                num = (int) Math.cos(num);
            }
            System.out.println("Your number is equal to " + num);
        }
        System.out.println("You won! Your number is equal to 1001!");
    }
}
