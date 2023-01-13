package 그리디.B1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(bf.readLine());;
            int[][] arr = new int[N][2];
            int cnt = 1;

            for(int j = 0; j < N; j++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));

            int prev = arr[0][1];
            for(int k = 1; k < N; k++){
                if(arr[k][1] < prev){
                    cnt++;
                    prev  = arr[k][1];
                }
            }
            System.out.println(cnt);
        }
    }
}