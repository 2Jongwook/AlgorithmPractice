package 자료구조.B1764HashMapgetOrDefault;

import java.util.HashMap;

public class practicegetOrDefault {
    public static void main(String[] args) {

        String[] abc = {"a", "b", "c", "c"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String key : abc){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println("결과 :" + map);
    }
}
