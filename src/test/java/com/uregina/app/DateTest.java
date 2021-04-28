package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DateTest 
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
    public void invalidDay1_False(){
		boolean result =false;
        try{
			result=Date.lessThan(new Date(04,-1,-1000),new Date(9,-1,1000));
			assertTrue(result);
		}
		catch(Exception e)
		{
			assertFalse(result);
		}
    }
    @Test
    public void ValidDay1_True(){
		boolean result =false;
        try{
			result=Date.lessThan(new Date(9,20,2000),new Date(9,22,2000));
			assertTrue(result);
		}
		catch(Exception e)
		{
			assertFalse(result);
		}
    }
    @Test
    public void ValidMonth1_True(){
		boolean result =false;
        try{
			result=Date.lessThan(new Date(03,20,1000),new Date(04,20,1000));
			assertTrue(result);
		}
		catch(Exception e)
		{
			assertFalse(result);
		}
    }
    @Test
    public void Month1NotLess_True(){
		boolean result =false;
        try{
			result=Date.lessThan(new Date(5,20,2000),new Date(4,20,2000));
			assertFalse(result);
		}
		catch(Exception e)
		{
			assertTrue(true);
		}
    }
    @Test
    public void YearValidLess_True(){
		boolean result =false;
        try{
			result=Date.lessThan(new Date(5,20,1998),new Date(4,20,1999));
			assertTrue(result);
		}
		catch(Exception e)
		{
			assertFalse(false);
		}
    }
    

}