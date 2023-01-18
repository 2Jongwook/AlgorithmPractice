package 자료구조.B14425HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;

        HashMap<String, Integer> map = new HashMap<>();   //해시 맵 설정, key, value로 구성

        for (int i = 0; i < N; i++){
            map.put(sc.next(), 1);      //해시 맵에 값 저장
        }
        for(int j = 0; j < M; j++){
           String str = sc.next();
           if(map.get(str) != null){    //해시 맵에 저장된 값과 입력받은 값을 비교
               cnt++;
           }
        }
        System.out.println(cnt);
    }
}
