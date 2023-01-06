package B10162전자레인지;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = 0; int B = 0; int C = 0;
        int T = sc.nextInt();

        if(T >= 300){
            A = T / 300;
            T -= 300 * A;
        }
        if(T >= 60 && T < 300){
            B = T / 60;
            T -= 60 * B;
        }
        if(T >= 10 && T < 60){
            C = T / 10;
            T -= 10 * C;
        }
        if(T == 0){
            System.out.println(A + " " + B + " " + C);
        }else{
            System.out.println(-1);
        }
    }
}
