package 그리디.B1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(bf.readLine());      // int범위를 벗어나 long으로 선언
        int cnt = 0;
        long sum = 0;

        for(int i = 1; ; i++){
            if(sum > S){
                break;
            }
            sum += i;
            cnt++;
        }
        System.out.println(cnt-1);

    }

}
