package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] splittedData = st.split(" ");

        HashMap<String, Integer> occurences = new HashMap<>();

        for (int i = 0; i < splittedData.length; i++) {
            Integer previousCount = occurences.get(splittedData[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            occurences.put(splittedData[i], previousCount + 1);
        }

        System.out.println(occurences);

        String[] strArray = st.split(" ");
        float totalChars = 0;
        for(String s : strArray){
            totalChars += s.length();
        }
        float words = strArray.length;
        float averageWordLength = (float)(totalChars/words);
        System.out.println("Average length of the sentence is: "+averageWordLength);


        }

}
