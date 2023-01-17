package 그리디.B14659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int cnt = 0;
            for(int j = i + 1; j < N; j++){
                if(arr[i] > arr[j]){
                    cnt++;
                }else{
                    break;
                }
            }
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}
