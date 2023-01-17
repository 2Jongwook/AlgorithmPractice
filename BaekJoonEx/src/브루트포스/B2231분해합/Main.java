package 브루트포스.B2231분해합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;

        for (int i = 0; i < N; i++){
            int number = i;
            int sum = 0;

            while (number != 0){
                sum += number % 10; //각 자릿수 더하기
                number /= 10;
            }

            if(sum + i == N){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

}
