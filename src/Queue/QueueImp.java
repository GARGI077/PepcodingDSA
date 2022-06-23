package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImp {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue);

        queue.add(10);
        System.out.println(queue);
        queue.add(20);
        System.out.println(queue);

    }
}
