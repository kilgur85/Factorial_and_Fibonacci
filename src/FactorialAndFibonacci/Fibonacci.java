package FactorialAndFibonacci;

public class Fibonacci {
    public static int[] fibonacciNumberInCycleFor(int n) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] fibonacciNumberInCycleDoWhile(int n) {
        int count = 2;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        while (count < n) {
            array[count] = array[count - 1] + array[count - 2];
            count++;
        }
        return array;

    }

    public static int[] fibonacciNumbersWithRecursion(int n, int[] arrayfib) {
        if (arrayfib[0] == 0) {
            arrayfib[0] = 1;
            arrayfib[1] = 1;
            return fibonacciNumbersWithRecursion(n, arrayfib);
        } else {
            int i;
            for (i = 0; i < arrayfib.length; i++) {
                if (arrayfib[i] == 0) {
                    break;
                }
            }
            if (n > i) {
                arrayfib[i] = arrayfib[i - 1] + arrayfib[i - 2];
                return fibonacciNumbersWithRecursion(n, arrayfib);
            }
        }
        return arrayfib;
    }

    public int[] fibonacciMetods(int metodsType, int n, int[] arrayfib) {

        switch (metodsType) {
            case 1:
                return fibonacciNumberInCycleDoWhile(n);
            case 2:
                return fibonacciNumbersWithRecursion(n, arrayfib);
            case 3:
                return fibonacciNumberInCycleFor(n);

        }
        return new int[]{metodsType};
    }
}



