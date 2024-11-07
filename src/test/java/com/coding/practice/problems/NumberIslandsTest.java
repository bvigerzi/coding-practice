package com.coding.practice.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberIslandsTest {

    @Test
    void case1() {
        char[][] grid = new char[][] {
                new char[]{'1','1','1','1','0'},
                new char[]{'1','1','0','1','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','0','0','0'},
        };

        NumberIslands numberIslands = new NumberIslands();
        assertEquals(1, numberIslands.numIslands(grid));
    }

    @Test
    void case2() {
        char[][] grid = new char[][] {
                new char[]{'1','1','0','0','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','1','0','0'},
                new char[]{'0','0','0','1','1'},
        };

        NumberIslands numberIslands = new NumberIslands();
        assertEquals(3, numberIslands.numIslands(grid));
    }

    @Test
    void case3() {
        char[][] grid = new char[][] {
                new char[]{'1'},
        };

        NumberIslands numberIslands = new NumberIslands();
        assertEquals(1, numberIslands.numIslands(grid));
    }
}
