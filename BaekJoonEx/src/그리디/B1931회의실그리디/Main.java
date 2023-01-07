package 그리디.B1931회의실그리디;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = sc.nextInt();   //시작
            arr[i][1] = sc.nextInt();   //종료
        }
    }
}
