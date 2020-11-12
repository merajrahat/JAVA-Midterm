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

        ArrayList<String>cars = new ArrayList<String>();
        cars.add("Tesla");
        cars.add("Lucid Air");
        cars.add("Rivian");
        cars.add("Ford");


        System.out.println(cars.get(2));

        System.out.println(cars.remove("Ford"));

        System.out.println("Car for Each loop: ");
        for (String model : cars) {
            System.out.println(model);
        }

        Iterator value = cars.iterator();
        System.out.println("retrieve value using iterator: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }

}
