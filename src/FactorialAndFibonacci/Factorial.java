package FactorialAndFibonacci;

public class Factorial {
    public Factorial(){

    }

    public static int getFactorialInCyclFor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getFactorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorialRecursion(n - 1);
        }
    }

    public static int getFactorialCycleWhile(int n) {
        int result = 1;
        while (n > 1) {
            result *= n--;
        }
        return result;
    }

}
