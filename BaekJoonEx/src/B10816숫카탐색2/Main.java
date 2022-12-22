package B10816숫카탐색2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int M = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(bf.readLine(), " ");

        for (int j = 0; j < M; j++){
            int b = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(b, 0)).append(' ');
        }

        System.out.println(sb);
    }
}
