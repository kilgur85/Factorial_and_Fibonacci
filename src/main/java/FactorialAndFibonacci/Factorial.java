package FactorialAndFibonacci;

public class Factorial {


    public  int getFactorialInCyclFor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public  int getFactorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorialRecursion(n - 1);
        }
    }

    public int[] getFactorialCycleWhile(int n) {
        int result = 1;
        while (n > 1) {
            result *= n--;
        }
        return new int[]{result};
    }
    public int[] factorialMetods (int metodsType, int n ){

        switch (metodsType){
            case 1:
                return getFactorialCycleWhile(n);
            case 2:
                return new int[]{getFactorialRecursion(n)};
            case 3:
                return new int[]{getFactorialInCyclFor(n)};
        }return new int[]{metodsType};
    }
}



