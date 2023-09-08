package 정렬;

public class CountingSort {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		int[] counting = new int[31];
		int[] result = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*31);
		}
		
		//counting sort
		//1. arr의 value 값을 index로 하는 counting 배열의 값 1 증가
		for(int i = 0; i < arr.length; i++) {
			counting[arr[i]]++;
		}
		
		//2. counting배열의 인덱스를 누적 합으로 변경 counting[i] = counting[i] + counting[i-1]
		for(int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1];
		}
		
		//3. arr의 i번째 값을 인덱스로 가지는 counting을 1감소시키고
		//		그 값을 result의 인덱스로 해 arr의 값을 넣는다.
		for(int i = 0; i < arr.length; i++) {
			int value = arr[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		//정렬 결과
		System.out.println("arr[]");
		for(int i = 0; i < arr.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n\n");
		
		System.out.println("counting[]");
		for(int i = 0; i < counting.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(counting[i] + "\t");
		}
		System.out.println("\n\n");
		
		System.out.println("result[]");
		for(int i = 0; i < result.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(result[i] + "\t");
		}
	}

}
