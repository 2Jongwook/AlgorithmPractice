package 그리디.B1049;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;

        int[] a = new int[M];
        int[] b = new int[M];

        for(int i = 0; i < M; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        while(true){
            if(N >= 6){
                if(a[0] <= (b[0] * 6)){
                    sum += a[0];
                    N -= 6;
                }
                if(a[0] > (b[0] * 6)){
                    sum += (b[0] * 6);
                    N -= 6;
                }
            }

            if(N < 6){
                if(a[0] < (b[0]) * N){
                    sum += a[0];
                    N = 0;
                }
                if(a[0] >= (b[0]) * N){
                    sum += (b[0] * N);
                    N = 0;
                }
            }

            if(N == 0){
                break;
            }
        }

        System.out.println(sum);
        
    }
}
