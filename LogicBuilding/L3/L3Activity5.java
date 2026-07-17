import java.util.Scanner;

public class L3Activity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] count = new int[10];

        System.out.println("Enter marks of 10 students:");

        for (int i = 0; i < 10; i++) {

            int mark = sc.nextInt();

            if (mark == 100)
                count[9]++;
            else if (mark % 10 == 0)
                count[(mark / 10) - 1]++;
            else
                count[mark / 10]++;
        }

        System.out.println("0%-10%   = " + count[0]);
        System.out.println("11%-20%  = " + count[1]);
        System.out.println("21%-30%  = " + count[2]);
        System.out.println("31%-40%  = " + count[3]);
        System.out.println("41%-50%  = " + count[4]);
        System.out.println("51%-60%  = " + count[5]);
        System.out.println("61%-70%  = " + count[6]);
        System.out.println("71%-80%  = " + count[7]);
        System.out.println("81%-90%  = " + count[8]);
        System.out.println("91%-100 = " + count[9]);
    }
}