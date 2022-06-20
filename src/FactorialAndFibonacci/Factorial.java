package FactorialAndFibonacci;

public class Factorial {


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
    public    int factorialMetods (int metodsType, int n ){

        switch (metodsType){
            case 1:
                return getFactorialCycleWhile(n);
            case 2:
                return getFactorialRecursion(n);
            case 3:
                return getFactorialInCyclFor(n);
        }return metodsType ;
    }
}



