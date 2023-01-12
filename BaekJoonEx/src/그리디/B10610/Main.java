package 그리디.B10610;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        char[] arr = N.toCharArray();
        Arrays.sort(arr);
        N = new StringBuilder(new String(arr)).reverse().toString(); //내림차순으로 변환

        //N의 각 자릿수의 합 구하기
        int sum = 0;
        for(int i = 0; i < N.length(); i++){
            sum += (arr[i] - '0');  //char - '0'을 해서 정수로
        }

        //0이 없거나 각 자릿수의 합이 3의 배수가 아님을 판별
        if((arr[0] - '0') != 0 || sum % 3 != 0){
            System.out.println(-1);
        }else{
            System.out.println(N);
        }
    }
}
