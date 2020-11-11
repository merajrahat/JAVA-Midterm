package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */


        // <key ,  value>
        HashMap<String, Integer> cityAndZipOfUSA = new HashMap<>();
        cityAndZipOfUSA.put("NY", 11324);
        cityAndZipOfUSA.put("DC", 36425);
        cityAndZipOfUSA.put("NJ", 23563);

        System.out.println(cityAndZipOfUSA.containsKey("NY"));  //true
        System.out.println(cityAndZipOfUSA.containsValue("NY")); //false
        System.out.println(cityAndZipOfUSA.containsValue(11324));  //true

        HashMap<String, Integer> cityAndZipOfCanada = new HashMap<>();
        cityAndZipOfCanada.put("VA", 7365);
        cityAndZipOfCanada.put("JH", 6789);
        System.out.println(cityAndZipOfCanada.containsKey("VA"));
        System.out.println(cityAndZipOfCanada.containsKey("VC"));
        System.out.println(cityAndZipOfCanada.containsValue(1000));
        System.out.println(cityAndZipOfCanada.containsValue(7365));

        HashMap<String, HashMap<String, Integer>> map = new HashMap();
        map.put("usa", cityAndZipOfUSA);
        map.put("canada", cityAndZipOfCanada);
        System.out.println(map);

        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(cityAndZipOfCanada);
        list.add(cityAndZipOfUSA);
        System.out.println(list);

        List<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Burger");

        List<String> drink = new ArrayList<>();
        drink.add("Coke");
        drink.add("Ginger Ale");

        List<String> foodAndDrink = new ArrayList<>();
        foodAndDrink.add("Best Food");
        foodAndDrink.add("Best Drinks");

        Map<String, List<String>> things = new HashMap<>();
        things.put("My Favorite Food", food);
        things.put("My Favorite Drink", drink);
        System.out.println(things);



    }

}
