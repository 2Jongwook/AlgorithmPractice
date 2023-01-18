package 자료구조.B10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static ArrayList<Integer> Stack;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack = new ArrayList<>();

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push":
                    Push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(Pop()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void Push(int i){
        Stack.add(i);
    }

    public static int Pop(){
        if(Stack.isEmpty()){
            return -1;
        }else{
            int p = Stack.get(Stack.size() - 1);
            Stack.remove(Stack.size() - 1);
            return p;
        }
    }

    public static int top(){
        if(Stack.isEmpty()){
            return -1;
        }else{
            return Stack.get(Stack.size() - 1);
        }
    }

    public static int empty(){
        if(Stack.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int size(){
        return Stack.size();
    }
}
