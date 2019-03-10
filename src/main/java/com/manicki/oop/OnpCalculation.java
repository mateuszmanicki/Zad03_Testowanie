package com.manicki.oop;

public class OnpCalculation {
    public int calculate(String operation) {
        int value1 = Integer.parseInt(String.valueOf(operation.charAt(0)));
        int value2 = Integer.parseInt(String.valueOf(operation.charAt(1)));
        char sing = operation.charAt(2);

        switch (sing) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                throw new WrongInputDataException();
        }
    }
}
