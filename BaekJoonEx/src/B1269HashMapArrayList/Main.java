package B1269HashMapArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //해시 맵과 어레이리스트를 각각 생성해주는 문제
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> A_list = new ArrayList<>();
        HashMap<Integer, Integer> A = new HashMap<>();
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            A_list.add(a);
            A.put(a, 0);
        }

        ArrayList<Integer> B_list = new ArrayList<>();
        HashMap<Integer, Integer> B = new HashMap<>();
        for(int i = 0; i < M; i++){
            int b = sc.nextInt();
            B_list.add(b);
            B.put(b, 0);
        }

        for(Integer i : A_list){    //A리스트에 있는 값을 B 해시 맵에서 제거
            if(B.containsKey(i))
                B.remove(i);
        }
        for(Integer j : B_list){    //B리스트에 있는 값을 A 해시 맵에서 제거
            if(A.containsKey(j))
                A.remove(j);
        }

        System.out.println(A.size() + B.size());
    }
}
