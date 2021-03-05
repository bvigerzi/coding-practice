package com.coding.practice.datastructs.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllUniqueTest {

    @Test
    void isAllUnique_false() {
        String nonUnique = "abcdefga";
        assertFalse(AllUnique.isAllUnique(nonUnique));
    }

    @Test
    void isAllUnique_true() {
        String unique = "abcdefg";
        assertTrue(AllUnique.isAllUnique(unique));
    }

    @Test
    void isAllUniqueNoStructs_false() {
        String nonUnique = "abcdefga";
        assertFalse(AllUnique.isAllUniqueNoStructs(nonUnique));
    }

    @Test
    void isAllUniqueNoStructs_true() {
        String unique = "abcdefg";
        assertTrue(AllUnique.isAllUniqueNoStructs(unique));
    }
}
