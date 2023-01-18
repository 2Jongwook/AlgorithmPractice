package 그리디.B14720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        int next = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 && next == 0){
                cnt++;
                next = 1;
                continue;
            }
            if(arr[i] == 1 && next == 1){
                cnt++;
                next = 2;
                continue;
            }
            if(arr[i] == 2 && next == 2){
                cnt++;
                next = 0;
                continue;
            }
        }

        System.out.println(cnt);
    }
}
