package 자료구조.B10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static ArrayList<Integer> listQueue;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        listQueue = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int i){
        listQueue.add(i);
    }

    public static int pop(){
        if(listQueue.isEmpty()){
            return -1;
        }else{
            int p = listQueue.get(0);
            listQueue.remove(0);
            return p;
        }
    }

    public static int size(){
        return listQueue.size();
    }

    public static int empty(){
        if(listQueue.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int front(){
        if(listQueue.isEmpty()){
            return -1;
        }else{
            return listQueue.get(0);
        }
    }

    public static int back(){
        if(listQueue.isEmpty()){
            return -1;
        }else{
            return listQueue.get(listQueue.size() - 1);
        }
    }
}
