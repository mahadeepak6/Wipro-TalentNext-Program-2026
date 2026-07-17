import java.util.Scanner;

public class L4Actvity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        String rev = "";

        for (int i = s2.length() - 1; i >= 0; i--) {

            rev = rev + s2.charAt(i);

        }

        String s3 = s1 + rev;

        System.out.println("Result = " + s3);

    }
}