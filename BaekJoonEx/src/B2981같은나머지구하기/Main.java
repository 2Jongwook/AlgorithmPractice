package B2981같은나머지구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int Val = arr[1] - arr[0];

        for(int i = 2; i < N; i++){
            Val = GCD(Val, arr[i] - arr[i-1]);
        }

        for(int i = 2; i <= Val; i++){
            if(Val % i == 0){
                System.out.print(i + " ");
            }
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
