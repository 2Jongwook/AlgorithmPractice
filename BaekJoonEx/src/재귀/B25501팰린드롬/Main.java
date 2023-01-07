package 재귀.B25501팰린드롬;

import java.util.Scanner;

public class Main{

    static int R;
    public static int recursion(String s, int l, int r){
        R++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int Test = sc.nextInt();

        for(int i = 0; i < Test; i++){
            R = 0;
            System.out.println(isPalindrome(sc.next()) + " " + R);
        }
    }
}
