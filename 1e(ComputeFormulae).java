import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cal1, cal2;
        Scanner scanner = new Scanner(System.in);

        cal1 = scanner.nextInt();
        cal2 = scanner.nextInt();

        Calc c = new Calc(cal1, cal2);
        System.out.println("Sum: " + c.add());
        System.out.println("Product: " + c.mul());

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double cValue = scanner.nextDouble();

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value of y: ");
        double y = scanner.nextDouble();

        System.out.print("Enter the value of z: ");
        double z = scanner.nextDouble();

        double result1 = (a / cValue) * z / a;
        double result2 = cValue++ + b / x - y;

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        scanner.close();
    }

    static class Calc {
        int a, b;

        Calc(int x, int y) {
            a = x;
            b = y;
        }

        int add() {
            return a + b;
        }

        int mul() {
            return a * b;
        }
    }
}
