package 그리디.B1715;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 0;
        PriorityQueue<Long> pq = new PriorityQueue<Long>();   //우선순위 큐를 사용


        for(int i = 0; i < N; i++){
            pq.add(sc.nextLong());
        }

        if(N == 1){
            System.out.println(0);
        }else {
            while (pq.size() > 1) {
                long temp = pq.poll();
                long temp2 = pq.poll();

                sum += temp + temp2;
                pq.add(temp + temp2);
            }
            System.out.println(sum);
        }
    }
}
