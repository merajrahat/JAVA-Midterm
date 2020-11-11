package datastructure;
import java.util.*;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> queue = new PriorityQueue<>();
        queue.add("America");
        queue.add("Canada");
        queue.add("Australia");
        queue.add("Cyprus");
        queue.add("Ireland");


        System.out.println(queue.peek());


        System.out.println(queue.remove("Canada"));


        System.out.println("retrieve value using for Each loop: ");
        for (String countries : queue) {
            System.out.println(countries);
        }

        System.out.println(queue.poll());


        Iterator value = queue.iterator();
        System.out.println("retrieve value using iterator: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

    }


}
