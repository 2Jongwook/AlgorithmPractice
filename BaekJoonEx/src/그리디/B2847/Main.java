package 그리디.B2847;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Lv = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            Lv[i] = sc.nextInt();
        }

        int max = Lv[Lv.length - 1];

        for(int i = N - 2; i >= 0; i--){
            if(Lv[i] >= max){
                while(true){
                    Lv[i]--;
                    cnt++;

                    if(Lv[i] < max){
                        break;
                    }
                }
                max = Lv[i];

            }
            if(Lv[i] < max){
                max = Lv[i];
                continue;
            }
        }

        System.out.println(cnt);
    }
}
