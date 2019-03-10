package com.manicki.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnpCalculationTest {
    @Test
    public void shouldReturnFourByMultiplyTwoByTwo(){
        String operation = "22*";
        OnpCalculation oopCalculation = new OnpCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(4, result);
    }

    @Test
    public void shouldReturnFiveByAddTwoByThree(){
        String operation = "23+";
        OnpCalculation oopCalculation = new OnpCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(5, result);
    }

    @Test
    public void shouldReturnFiveBySubEightByThree(){
        String operation = "83-";
        OnpCalculation oopCalculation = new OnpCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(5, result);
    }

    @Test
    public void shouldReturnTwoByDivEightByFour(){
        String operation = "84/";
        OnpCalculation oopCalculation = new OnpCalculation();

        int result = oopCalculation.calculate(operation);

        assertEquals(2, result);
    }

    @Test (expected = WrongInputDataException.class)
    public void shouldThrowException(){
        String operation = "02A";
        OnpCalculation oopCalculation = new OnpCalculation();

        oopCalculation.calculate(operation);
    }

}
