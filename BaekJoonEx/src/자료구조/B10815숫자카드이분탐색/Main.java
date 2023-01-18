package 자료구조.B10815숫자카드이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        for (int i = 0; i < M; i++){
            if(search(arr1, arr2[i]) != -1){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }

    }

    public static int search(int[] arr, int M){     //이분탐색
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (left <= right){
            mid = (left+right) / 2;
            if(arr[mid] < M)
                left = mid + 1;
            else if(arr[mid] > M)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
