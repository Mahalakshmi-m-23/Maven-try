package com.example.grade_calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {
    @Test
    void testTotal() {
        assertEquals(255, GradeCalculator.calculateTotal(85, 78, 92));
    }

    @Test
    void testAverage() {
        assertEquals(85.0, GradeCalculator.calculateAverage(85, 78, 92));
    }

    @Test
    void testPass() {
        assertTrue(GradeCalculator.isPass(85.0));
    }

    @Test
    void testFail() {
        assertFalse(GradeCalculator.isPass(35.0));
    }

    @Test
    void testGrade() {
        assertEquals("A", GradeCalculator.getGrade(85.0));
        assertEquals("F", GradeCalculator.getGrade(35.0));
    }
}