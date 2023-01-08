package 그리디.B2217로프;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] arr = new Integer[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        /*
        arr[0]과 arr[1] * 2 비교
        arr[1] * 2와 arr[2] * 3 비교와 같은 순서로 max값 갱신진행
        */
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i] * (i+1));    //내림차순에서 arr[0]과 arr[i] * i+1을 비교한다.
        }
        System.out.println(max);
    }
}
