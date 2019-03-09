package com.manicki.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OopCalculationTest {
    @Test
    public void shouldReturnFourByMultiplyTwoByTwo(){
        String operation = "22*";
        OopCalculation oopCalculation = new OopCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(4, result);
    }

    @Test
    public void shouldReturnFiveByAddTwoByThree(){
        String operation = "23+";
        OopCalculation oopCalculation = new OopCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(5, result);
    }

    @Test
    public void shouldReturnFiveBySubEightByThree(){
        String operation = "83-";
        OopCalculation oopCalculation = new OopCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(5, result);
    }

    @Test
    public void shouldReturnTwoByDivEightByFour(){
        String operation = "84/";
        OopCalculation oopCalculation = new OopCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(2, result);
    }
}
