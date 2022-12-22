package B1934최소공배;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A*B / GCD(A, B));
        }
    }

    public static int GCD(int A, int B){
        while (B != 0){
            int r = A % B;

            A = B;
            B = r;
        }
        return A;
    }
}
