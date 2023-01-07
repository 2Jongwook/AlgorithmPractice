package 그리디.B4796캠핑;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int Case = 1;

        while(true) {

            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            if(L == 0 && P == 0 && V == 0) {
                break;
            }

            cnt = ((V / P) * L) + Math.min((V % P), L); //Math.min으로 나머지가 L보다 클 떄 L로 설정하기 위함.
            System.out.println("Case " + Case + ":" + " " + cnt);
            Case++;

        }
    }
}
