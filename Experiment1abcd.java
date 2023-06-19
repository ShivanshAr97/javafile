import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Scanner res = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = res.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter number: ");
        number num = new number(res.nextInt());

        res.close();
        num.numberLines();
    }
}

class number {
        int n;
        number (int x){
            n=x;
        }
        void numberLines(){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }