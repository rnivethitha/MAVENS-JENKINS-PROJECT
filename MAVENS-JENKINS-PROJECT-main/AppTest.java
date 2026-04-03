package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCalculateGrade() {

        App app = new App();

        String result = app.calculateGrade(80, 75, 70);

        assertEquals("B", result);
    }

}
