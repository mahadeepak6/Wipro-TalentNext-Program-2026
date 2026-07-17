import java.util.Scanner;

public class L4Actvity3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        String s3 = s1 + s2;

        System.out.println("Concatenated String = " + s3);
    }
}