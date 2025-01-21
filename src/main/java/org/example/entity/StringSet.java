package org.example.entity;

import java.util.Set;
import java.util.TreeSet;

public class StringSet {
    public static Set<String> findUniqueWords() {
        String text = "Carroll began writing the manuscript of the story the next day, although that earliest version is lost. " +
                "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice.";
        String cleanedText = text.replaceAll("[.,!?\"']", "");
        String[] words = cleanedText.split("\\s+");

        Set<String> uniqueWords = new TreeSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords;
    }
}
