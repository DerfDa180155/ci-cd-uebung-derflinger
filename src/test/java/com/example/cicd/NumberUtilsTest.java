package com.example.cicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilsTest {

    @Test
    void isSpecial_acceptsThirteenAndSeventeen() {
        assertTrue(NumberUtils.isSpecial(13));
        assertTrue(NumberUtils.isSpecial(17));
    }

    @Test
    void isSpecial_rejectsEleven() {
        assertFalse(NumberUtils.isSpecial(11));
    }
}
