package 브루트포스.B2798blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(search(arr, N, M));
    }

    static int search(int[] arr, int N, int M){
        int result = 0;

        for (int i = 0; i<N-2; i++){
            for (int j = i + 1; j<N-1; j++){
                for (int k = j + 1; k<N; k++){
                    int temp = arr[i] + arr[j] + arr[k];

                    if(M == temp){
                        return temp;
                    }
                    if(result < temp && temp < M){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
