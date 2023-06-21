import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner res = new Scanner(System.in);

        System.out.print("Enter value A: ");
        int num1 = (res.nextInt());
        System.out.print("Enter value B: ");
        int num2 = (res.nextInt());
        System.out.print("Enter value R: ");
        float num3 = (res.nextFloat());
        area(num1,num2);
        area(num3);
}
        public static void area(int a,int b){
            System.out.println("Area of rectangle: "+a*b);
        }

        public static void area(float c){
            System.out.println("Area of circle: "+3.14*c*c);
        }
    }
