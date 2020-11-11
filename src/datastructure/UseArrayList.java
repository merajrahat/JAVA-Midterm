package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String>Priority = new ArrayList<String>();
        Priority.add("Messi");
        Priority.add("Ronaldo");
        Priority.add("Dybala");
        Priority.add("Aguero");


        System.out.println(Priority.get(2));

        System.out.println(Priority.remove("Aguero"));

        System.out.println("retrieve value using for Each loop: ");
        for (String Players : Priority) {
            System.out.println(Players);
        }

        Iterator value = Priority.iterator();
        System.out.println("retrieve value using iterator: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }

}
