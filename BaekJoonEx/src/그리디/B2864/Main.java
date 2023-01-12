package 그리디.B2864;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int max = 0;
        int min = 0;

        A = A.replace('5', '6');
        B = B.replace('5', '6');

        max = Integer.parseInt(A) + Integer.parseInt(B);

        A = A.replace('6', '5');
        B = B.replace('6', '5');

        min = Integer.parseInt(A) + Integer.parseInt(B);

        System.out.println(min + " " + max);

    }
}
