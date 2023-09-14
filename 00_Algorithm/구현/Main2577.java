package 구현;

import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int parti = 1;
		for(int i = 0; i < 3; i++) {
			parti *= sc.nextInt();
		}
		
		String[] arr = Integer.toString(parti).split("");
		int[] result = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("0")) {
				result[0]++;
			}else if(arr[i].equals("1")) {
				result[1]++;
			}else if(arr[i].equals("2")) {
				result[2]++;
			}else if(arr[i].equals("3")) {
				result[3]++;
			}else if(arr[i].equals("4")) {
				result[4]++;
			}else if(arr[i].equals("5")) {
				result[5]++;
			}else if(arr[i].equals("6")) {
				result[6]++;
			}else if(arr[i].equals("7")) {
				result[7]++;
			}else if(arr[i].equals("8")) {
				result[8]++;
			}else if(arr[i].equals("9")) {
				result[9]++;
			}
		}
		
		for(int k : result) {
			System.out.println(k);
		}
	}
}
