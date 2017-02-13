/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datedifference;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harman
 */
public class DateTest {

    public DateTest() {
    }

    /**
     * Test of daysTo method, of class Date.
     */
    @Test
    public void testDaysTo1() {

        Date d1 = new Date(2017, 2, 30);
        Date d2 = new Date(2017, 2, 1);
        int d1Expected = 29;
        int d1Result = d1.daysTo(d2);

        assertEquals(d1Expected, d1Result);
    }

    @Test
    public void testDaysTo2() {

        Date d1 = new Date(2016, 1, 1);
        Date d2 = new Date(2017, 2, 1);
        int d1Expected = 60;
        int d1Result = d1.daysTo(d2);

        assertEquals(d1Expected, d1Result);
    }

    @Test
    public void testDaysTo3() {

        Date d1 = new Date(2016, 2, 1);
        Date d2 = new Date(2017, 2, 1);
        int d1Expected = 300;
        int d1Result = d1.daysTo(d2);

        assertEquals(d1Expected, d1Result);
    }

}
