import java.util.Scanner;

public class L5Activity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];

        System.out.println("Enter 5 elements for Array 1:");

        for (int i = 0; i < 5; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Enter 5 elements for Array 2:");

        for (int i = 0; i < 5; i++)
            arr2[i] = sc.nextInt();

        // Sort Array 1

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4 - i; j++) {

                if (arr1[j] < arr1[j + 1]) {

                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;

                }

            }

        }

        // Sort Array 2

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4 - i; j++) {

                if (arr2[j] < arr2[j + 1]) {

                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;

                }

            }

        }

        int k = 0;

        for (int i = 0; i < 5; i++)
            arr3[k++] = arr1[i];

        for (int i = 0; i < 5; i++)
            arr3[k++] = arr2[i];

        System.out.println("Merged Array:");

        for (int i = 0; i < 10; i++)
            System.out.print(arr3[i] + " ");

    }
}