package 그리디.B11399ATM시간최솟값;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
