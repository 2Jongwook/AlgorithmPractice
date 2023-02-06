package 자료구조.B1920;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Integer, Integer> a_map = new HashMap<>();
        for(int i = 0; i < N; i++){
            a_map.put(sc.nextInt(), 1);
        }

        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            int m = sc.nextInt();
            if(a_map.containsKey(m)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
