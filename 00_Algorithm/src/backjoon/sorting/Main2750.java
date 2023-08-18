package backjoon.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main2750 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a[] = new int[N];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
