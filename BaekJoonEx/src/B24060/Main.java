package B24060;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }


    }

    static void merge_sort(int[] A, int p, int r){
        if(p < r) {
            int q = (p+r)/2;
            merge_sort(A, p, q);
            merge_sort(A, q+1, r);
            merge(A, p, q, r);
        }
    }

    static void merge(int[] A, int p, int q, int r){
        int i = p; int j = q+1; int t = 1; int[] tmp = new int[A.length];

        while (i <= q && j <= r){
            if(A[i] <= A[j]){
                tmp[t++] = A[i++];
            }else{
                tmp[t++] = A[j++];
            }
        }
        while (i <= q){
            tmp[t++] = A[i++];
        }
        while (j <= r){
            tmp[t++] = A[j++];
        }
        i = q; t = 1;
        while (i <= r){
            A[i++] = tmp[t++];
        }
    }
}
