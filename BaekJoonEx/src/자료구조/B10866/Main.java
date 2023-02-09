package 자료구조.B10866;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static Deque<Integer> deque = new LinkedList();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;
                case "pop_back":
                    sb.append(pop_back()).append('\n');
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

    public static void push_front(int i){
        deque.addFirst(i);
    }

    public static void push_back(int i){
        deque.addLast(i);
    }

    public static int pop_front(){
        if(deque.isEmpty()){
            return -1;
        }else{
            return deque.pollFirst();
        }
    }

    public static int pop_back(){
        if(deque.isEmpty()){
            return -1;
        }else{
            return deque.pollLast();
        }
    }

    public static int size(){
        return deque.size();
    }

    public static int empty(){
        if(deque.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int front(){
        if(deque.isEmpty()){
            return -1;
        }else{
            return deque.peekFirst();
        }
    }

    public static int back(){
        if(deque.isEmpty()){
            return -1;
        }else{
            return deque.peekLast();
        }
    }
}
