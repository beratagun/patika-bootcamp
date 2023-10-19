package week5.MostRepetitiveWords;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please write a sentence : ");
        String sentence = input.nextLine();

        String[] arrOfsentence = sentence.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : arrOfsentence) {

            String lowercaseWord = word.toLowerCase();
            if (wordCount.containsKey(lowercaseWord)) {
                int count = wordCount.get(lowercaseWord);
                wordCount.put(lowercaseWord, count + 1);
            } else {
                wordCount.put(lowercaseWord, 1);
            }

        }

        int maxCount = 0;
        String mostRepetitiveWord = "";

        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostRepetitiveWord = word;
            }
        }
        System.out.println("Most repetitive word: " + mostRepetitiveWord + ", Count: " + maxCount);
    }

}