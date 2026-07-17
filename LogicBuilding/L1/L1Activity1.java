

import java.util.Scanner;

public class L1Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter value of B: ");
        int b = sc.nextInt();

        System.out.print("Enter value of C: ");
        int c = sc.nextInt();

        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        sc.close();
    }
}