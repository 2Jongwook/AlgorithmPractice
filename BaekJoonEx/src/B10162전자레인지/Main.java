package B10162전자레인지;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 60, 300};
        int A = 0; int B = 0; int C = 0;
        int T = sc.nextInt();

        for(int i = 2; i >= 0; i--){
            if(i == 2 && arr[i] <= T){
                A += (T / arr[i]);
                T = T % arr[i];
            }if(i == 1 && arr[i] <= T){
                B += (T / arr[i]);
                T = T % arr[i];
            }if(i == 0 && arr[i] <= T){
                C += (T / arr[i]);
                T = T % arr[i];
            }
        }
        if(T == 0) {
            System.out.println(A + " " + B + " " + C);
        }else{
            System.out.println(-1);
        }
    }
}
