package 정렬;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] select = {7, 3, 2, 8, 9, 4, 6, 1, 5};
		
		for(int i = 0; i < select.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < select.length; j++) {
				if(select[j] < select[min]) {
					min = j;
				}
			}
			
			swap(select, min, i);
		}
		
		for(int i : select) {
			System.out.print(i + " ");
		}
	}
	
	private static void swap(int[] select, int i, int j) {
		int temp = select[i];
		select[i] = select[j];
		select[j] = temp;
	}

}
