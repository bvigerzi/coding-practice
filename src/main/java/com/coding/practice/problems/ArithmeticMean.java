package com.coding.practice.problems;

import java.util.List;

public class ArithmeticMean {

    private ArithmeticMean() {}

    public static int sameMean(List<Integer> input) {
        if(input == null || input.size() <= 1) {
            return -1;
        }
        int sum = input.stream().reduce(0, Integer::sum);

        if(sum % input.size() == 0) {
            int mean = sum / input.size();
            return input.stream().filter(i -> i==mean).findFirst().orElse(-1);
        }

        return -1;
    }
}
