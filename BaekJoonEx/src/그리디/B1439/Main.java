package 그리디.B1439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] arr = S.toCharArray();
        int zero = 0, one = 0;

        if(arr[0] == '0'){
            zero++;
        }else {
            one++;
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                if(arr[i] == '0'){
                    zero++;
                }
                if(arr[i] == '1'){
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));

    }
}
