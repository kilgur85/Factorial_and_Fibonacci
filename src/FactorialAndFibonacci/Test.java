package FactorialAndFibonacci;

public class Test {
    Factorial factorial = new Factorial();
    Fibonacci fibonacci = new Fibonacci();

    public Object swicthMetods (int metodsType , int n){

        switch (metodsType){
            case 1:
                return factorial.factorialMetods(metodsType ,n);
            case 2:
                return fibonacci.fibonacciMetods(metodsType,n,new int[n]);

        }
        return new int[]{metodsType};
    }

}


