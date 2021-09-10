package com.davios.oops;

public class MethodOverload {

    int a =10;
    int binVal = 0b11010;
    long creditCardNumber = 1234_5678_9012_3456L;
    public static void  main (String...s){

        MethodOverload obj = new MethodOverload();

        System.out.println( obj.arguments(2,4));
        System.out.println( obj.arguments(2.0,4));
        obj.print();

    }

    void print(){
        System.out.println(binVal);
        System.out.println(creditCardNumber);
    }
    public int   arguments(int a, int b){

        return a+b;
    }


    public double   arguments(double a, int b){

        return  (a+b);
    }

}
