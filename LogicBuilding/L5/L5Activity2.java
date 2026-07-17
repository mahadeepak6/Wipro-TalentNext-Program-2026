import java.util.Scanner;

public class L5Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort Array

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        System.out.println("Array without duplicates:");

        System.out.print(arr[0] + " ");

        for (int i = 1; i < 10; i++) {

            if (arr[i] != arr[i - 1]) {

                System.out.print(arr[i] + " ");

            }

        }

    }
}