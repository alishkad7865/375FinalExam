package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TicketTest 
{
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void checkTicket() {
        boolean result = false;
        try {
            result = Ticket.checkTicket(new ArrayList<Flight> Flight("YQR","YYZ",new Time12(9,00,AmPm.am), new Time12(12,00,AmPm.am)),1,12,5,true);
            assertTrue(result);
        } catch (Exception e) {
            assertFalse(false);
        }
    }
}