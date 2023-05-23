package com.coding.practice.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticMeanTest {

    @Test
    void basicInputSuccess() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        assertEquals(3, ArithmeticMean.sameMean(input));
    }

    @Test
    void basicInputFailure() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1,2,3,4,5,6));

        assertEquals(-1, ArithmeticMean.sameMean(input));
    }

    @Test
    void emptyList() {
        ArrayList<Integer> input = new ArrayList<>();

        assertEquals(-1, ArithmeticMean.sameMean(input));
    }

    @Test
    void singleItemList() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1));

        assertEquals(-1, ArithmeticMean.sameMean(input));
    }

    @Test
    void nullItemList() {
        assertEquals(-1, ArithmeticMean.sameMean(null));
    }
}
