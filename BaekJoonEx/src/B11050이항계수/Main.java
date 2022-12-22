package B11050이항계수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(factorial(N) / (factorial(N-K) * factorial(K)));
        //이항계수 N K 는 nCk와 같으므로 [N! / ((N-K)! * K!)]로 나타낸다.
    }

    public static int factorial(int N){
        if(N <= 1){
            return 1;
        }
        return N * factorial(N - 1);
    }
}
