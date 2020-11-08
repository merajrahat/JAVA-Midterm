package datastructure;

import java.util.HashMap;

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


    }

}
