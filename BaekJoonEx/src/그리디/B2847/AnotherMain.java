package 그리디.B2847;

import java.util.Scanner;

public class AnotherMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] lv = new int[N];

        for(int i = 0; i < N; i++){
            lv[i] = sc.nextInt();
        }

        if(N == 1){
            System.out.println(0);
        }else{
            int cnt = 0;

            for(int i = N - 2; i >= 0; i--){
                int high = lv[i + 1];
                int low = lv[i];

                if(low >= high){
                    cnt += low - (high - 1);
                    lv[i] = high - 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
