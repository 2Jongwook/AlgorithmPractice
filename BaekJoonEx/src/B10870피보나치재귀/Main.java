package B10870피보나치재귀;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/* 배열을 이용한 방법
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                arr[0] = 0;
            }else if(i == 1){
                arr[1] = 1;
            }else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        System.out.println(arr[n]);
*/
        //재귀 이용 방법
        int n = sc.nextInt();

        int F = fibo(n);

        System.out.println(F);
    }
    public static int fibo(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}

