package 자료구조.B10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++){
            int num = sc.nextInt();

            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }
        }

        int sum = 0;
        for(int i : stack){
            sum += i;
        }
        System.out.println(sum);

    }

}
