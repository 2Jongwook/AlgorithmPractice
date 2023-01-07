package 그리디.B5585거스름돈;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = {1, 5, 10, 50, 100, 500};
        int total = 1000-N;
        int cnt = 0;

        for(int i = 5; i >= 0; i--){
            if(arr[i] <= total){
                cnt += (total / arr[i]);
                total = total % arr[i];
            }

        }

        System.out.println(cnt);


    }
}
