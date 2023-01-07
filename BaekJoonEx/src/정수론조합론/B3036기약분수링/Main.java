package 정수론조합론.B3036기약분수링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r1 = sc.nextInt();

        for(int i = 0; i<N-1; i++){
            int a = sc.nextInt();
            System.out.println(r1/GCD(r1, a) + "/" + a/GCD(r1, a));
        }
    }
    public static int GCD(int A, int B){ //최대공약수 구하기
        while (B != 0) {
            int r = A % B;

            A = B;
            B = r;
        }
        return A;
    }
}
