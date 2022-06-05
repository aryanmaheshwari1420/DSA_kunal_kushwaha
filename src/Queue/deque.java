package Queue;
import java.util.*;
import java.util.ArrayList;
public class deque {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(15);
        deque.add(85);
        deque.add(35);
        deque.add(15);
        deque.add(25);
        deque.add(5);
        System.out.println(deque);
//        deque.addLast(12);
        deque.removeLast();
        System.out.println(deque);
    }
}
