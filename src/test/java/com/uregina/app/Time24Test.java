package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Time24Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void CorrectTime_true(){
        Time24 time= null;
        AmPm am= AmPm.am;
        time= Time24.toTime24(7, 59,am);
        int expectedhour=7;
        int expectedmin=59;
        assertEquals(time.getHours(),expectedhour);
        assertEquals(time.getMinutes(),expectedmin);
    }

    @Test
    public void CorrectTimeTo_24hr(){
        AmPm am= AmPm.am;
        Time24 time= Time24.toTime24(7, 59,AmPm.pm);
        int expectedhour=19;
        int expectedmin=59;
        assertEquals(time.getHours(),expectedhour);
        assertEquals(time.getMinutes(),expectedmin);
    }

}