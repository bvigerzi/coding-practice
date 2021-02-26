package com.coding.practice.optimise;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class FirstUniqueCharIndex {

    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> uniqueCharsIndexMap = new LinkedHashMap<>();
        HashSet<Character> visitedChars = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(uniqueCharsIndexMap.containsKey(currentChar)) {
                uniqueCharsIndexMap.remove(currentChar);
            } else if(!visitedChars.contains(currentChar)) {
                uniqueCharsIndexMap.put(currentChar, i);
            }
            visitedChars.add(currentChar);
        }
        if(uniqueCharsIndexMap.isEmpty()) {
            return -1;
        }
        return uniqueCharsIndexMap.values().stream().findFirst().get().intValue();
    }
}
