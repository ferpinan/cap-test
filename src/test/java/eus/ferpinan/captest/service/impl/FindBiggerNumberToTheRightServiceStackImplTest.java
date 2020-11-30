package eus.ferpinan.captest.service.impl;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindBiggerNumberToTheRightServiceStackImplTest {

    private FindBiggerNumberToTheRightServiceStackImpl service;

    @Before
    public void setUp() {
        service = new FindBiggerNumberToTheRightServiceStackImpl();
    }

    @Test
    public void givenAnArrayOfInteger_4_5_2_25_itShouldReturnAnArrayOfInteger_5_25_25_n1() {
        Integer[] numberArray = {4, 5, 2, 25};
        Integer[] result = service.execute(numberArray);
        assertEquals(Integer.valueOf(5), result[0]);
        assertEquals(Integer.valueOf(25), result[1]);
        assertEquals(Integer.valueOf(25), result[2]);
        assertEquals(Integer.valueOf(-1), result[3]);
    }

    @Test
    public void givenNullArray_itShouldReturnEmptyArray() {
        Integer[] result = service.execute(null);
        assertEquals(0, result.length);
    }

    @Test
    public void givenEmptyArray_itShouldReturnEmptyArray() {
        Integer[] result = service.execute(new Integer[0]);
        assertEquals(0, result.length);
    }
}