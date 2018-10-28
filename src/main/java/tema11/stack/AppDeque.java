package tema11.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AppDeque {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("1-Carlos");
        dq.add("2-Carlos");
        dq.add("3-Carlos");

        String x = dq.peek();
        System.out.println("Peek " + x);

        x = dq.poll();
        System.out.println("Poll " + x);

        x = dq.pop();
        System.out.println("Pop " + x);

        dq.addFirst("0-Carlos");
        dq.addLast("4-Carlos");

        for (String elemento : dq){
            System.out.println(elemento);
        }
    }

}
