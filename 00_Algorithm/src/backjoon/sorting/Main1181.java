package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			map.put(s, s.length());
		}
		
		List<String> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet);
		
		keySet.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o1).compareTo(map.get(o2));
			}
		});
		
		for(String key : keySet) {
			System.out.println(key);
		}
	}
}
