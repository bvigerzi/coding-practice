package com.coding.practice.datastructs.array;

import java.util.HashSet;

public class AllUnique {

    public static boolean isAllUnique(String s) {
        HashSet<Character> visitedChars = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            Character visitingChar = s.charAt(i);
            if(visitedChars.contains(visitingChar)) {
                return false;
            }
            visitedChars.add(visitingChar);
        }
        return true;
    }

    public static boolean isAllUniqueNoStructs(String s) {
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            for(int j = i + 1; j < s.length(); j++) {
                if(currentChar == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
