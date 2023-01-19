package 그리디.B14916;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        if(N % 5 == 0){
            System.out.println(N/5);
        }else if(N >= 5 && (N % 5) % 2 == 0){
            cnt += N / 5;
            N = N % 5;
            cnt += N / 2;
            System.out.println(cnt);
        }else if(N >= 5 && (N % 5) % 2 != 0){
            while(true){
                N -= 2;
                cnt++;
                if(N % 5 == 0){
                    break;
                }
            }
            cnt += N / 5;
            System.out.println(cnt);
        }else if(N < 5 && N % 2 == 0){
            System.out.println(N / 2);
        }else{
            System.out.println(-1);
        }
    }
}
