package 그리디.B2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = {25, 10, 5, 1};

        for(int i = 0; i < T; i++){
            int[] qdnp = {0, 0, 0, 0};
            int C = sc.nextInt();

            for(int j = 0; j < arr.length; j++){
                if(arr[j] <= C){
                    qdnp[j] += (C / arr[j]);
                    C = (C % arr[j]);
                }
            }

            for(int k = 0; k < qdnp.length; k++){
                System.out.print(qdnp[k] + " ");
            }
        }
    }
}
