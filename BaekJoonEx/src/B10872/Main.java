package B10872;

import java.util.Scanner;

public class Main{
public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int F = factorial(N);

    System.out.println(F);

    }
    public static int factorial(int N){
    if(N<=1){
            return 1;
        }else{
        return N * factorial(N - 1);
        }
    }
}