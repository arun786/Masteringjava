package com.arun.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adwiti on 7/23/2017.
 */
public class Challenge1 {
    public static void main(String[] args) {
        int count = getDistinctCount("hello");
        System.out.println(count);
        count = getDistinctCount("helloe");
        System.out.println(count);
        count = getDistinctCount("eeffgghhi");
        System.out.println(count);

    }

    public static int getDistinctCount(String word) {
        int count = 0;

        Map<Character, Integer> mapOfDistinct = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (mapOfDistinct.containsKey(c)) {
                int value = mapOfDistinct.get(c);
                mapOfDistinct.put(c, ++value);
            } else {
                mapOfDistinct.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> map : mapOfDistinct.entrySet()) {
            if (map.getValue() == 1) {
                count++;
            }
        }
        return count;
    }
}
