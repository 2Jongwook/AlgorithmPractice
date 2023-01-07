package 집합과맵.B1764HashMapgetOrDefault;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();   //해시 맵 설정, key, value로 구성

        for (int i = 0; i < N; i++){
            map.put(sc.next(), 1);      //해시 맵에 값 저장
        }
        for(int j = 0; j < M; j++){
           String name = sc.next();
           map.put(name, map.getOrDefault(name, 0) + 1);
           //getOrDefault 함수는 찾는 키가 맵에 있으면 찾는 키의 값을 반환하고 없으면 기본 값을 반환하는 함수
           if(map.get(name) == 2) list.add(name);
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}
