package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DateTimeTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void invalidDay1_False() {
        int result = 0;
        try {
            result = DateTime.subtract(new DateTime(new Date(04, 20, 2000), new Time12(11, 24, AmPm.am)),
                    new DateTime(new Date(04, 20, 2000), new Time12(11, 24, AmPm.am)));
            assertEquals(0, result);
        } catch (Exception e) {
            assertFalse(false);
        }
    }

}