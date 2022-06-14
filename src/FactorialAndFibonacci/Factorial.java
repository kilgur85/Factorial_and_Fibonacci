package FactorialAndFibonacci;

public class Factorial {
    protected int numberOfFactoral;
    public Factorial(){

    }
    public Factorial(int numberOfFactoral) {
        this.numberOfFactoral = numberOfFactoral;
    }

    public  int getFactorialInCyclFor(int  numberOfFactoral) {
        int result = 1;
        for (int i = 1; i <=  numberOfFactoral; i++) {
            result = result * i;
        }
        return result;
    }

    public  int getFactorialRecursion(int  numberOfFactoral) {
        if ( numberOfFactoral <= 1) {
            return 1;
        } else {
            return  numberOfFactoral * getFactorialRecursion( numberOfFactoral - 1);
        }
    }

    public  int getFactorialCycleWhile(int  numberOfFactoral) {
        int result = 1;
        while ( numberOfFactoral > 1) {
            result *=  numberOfFactoral--;
        }
        return result;
    }


    public int getNumberOfFactoral() {
        return numberOfFactoral;
    }

    public void setNumberOfFactoral(int numberOfFactoral) {
        this.numberOfFactoral = numberOfFactoral;
    }

}
