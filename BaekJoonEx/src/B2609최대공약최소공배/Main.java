package B2609최대공약최소공배;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    //유클리드 호재법이라는 알고리즘

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

       System.out.println(GCD(A, B));
       System.out.println(A*B / GCD(A, B));    // 최소공배수는 "(두 수의 곱)/최대공약수"이다.
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
