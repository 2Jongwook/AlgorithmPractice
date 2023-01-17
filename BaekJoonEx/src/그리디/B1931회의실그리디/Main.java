package 그리디.B1931회의실그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        int cnt = 1;

        for(int i = 0; i < N; i++){
            arr[i][0] = sc.nextInt();   //시작
            arr[i][1] = sc.nextInt();   //종료
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o1[1];
            }
        });

        int temp = arr[0][1];
        for(int j = 0; j < N; j++){
            if(arr[j][0] >= temp){
                cnt++;
                temp = arr[j][1];
            }
        }

        System.out.println(cnt);

    }
}
