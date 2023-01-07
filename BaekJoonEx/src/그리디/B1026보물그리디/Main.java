package 그리디.B1026보물그리디;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(B, Collections.reverseOrder());

        int S = 0;
        for(int i = 0; i < N; i++){
            S += A[i]*B[i];
        }
        System.out.println(S);
    }
}
