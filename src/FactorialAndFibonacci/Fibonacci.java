package FactorialAndFibonacci;

public class Fibonacci {
    public static int[] fibonacciNumberInCycleFor(int fibonacciNUmber) {
        int[] array = new int[fibonacciNUmber];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] fibonacciNumberInCycleDoWhile(int fibonacciNUmber) {
        int count = 2;
        int[] array = new int[fibonacciNUmber];
        array[0] = 1;
        array[1] = 1;
        while (count < fibonacciNUmber) {
            array[count] = array[count - 1] + array[count - 2];
            count++;
        }
        return array;

    }

    public static int[] fibonacciNumbersWithRecursion(int fibonacciNUmber, int[] arrayfib) {
        if (arrayfib[0] == 0) {
            arrayfib[0] = 1;
            arrayfib[1] = 1;
            return fibonacciNumbersWithRecursion(fibonacciNUmber, arrayfib);
        } else {
            int i;
            for (i = 0; i < arrayfib.length; i++) {
                if (arrayfib[i] == 0) {
                    break;
                }
            }
            if (fibonacciNUmber > i) {
                arrayfib[i] = arrayfib[i - 1] + arrayfib[i - 2];
                return fibonacciNumbersWithRecursion(fibonacciNUmber, arrayfib);
            }
        }
        return arrayfib;
    }

    public int[] fibonacciMetods(int metodsType, int fibonacciNUmber, int[] arrayfib) {
        int[] result = new int[fibonacciNUmber];
        switch (metodsType) {
            case 1:
                return fibonacciNumberInCycleDoWhile(fibonacciNUmber);
            case 2:
                return fibonacciNumbersWithRecursion(fibonacciNUmber, arrayfib);
            case 3:
                return fibonacciNumberInCycleFor(fibonacciNUmber);

        }
        return result;
    }
}



