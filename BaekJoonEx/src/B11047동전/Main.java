package B11047동전;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K =sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = N - 1; i >= 0; i--){
            if(arr[i] <= K){    // 가장 큰 값의 수가 K와 같다면
                count += (K / arr[i]);
                // 그 값으로 구성할 수 있는 값을 구한다. EX) K가 1100원이고 arr[i]가 500이면 count = 2
                K = K % arr[i]; //위 예시로 따지면 K = 100이 된다.
            }
        }

        System.out.println(count);


    }
}
