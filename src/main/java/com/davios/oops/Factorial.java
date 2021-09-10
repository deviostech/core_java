package com.davios.oops;

public class Factorial {

    public static void main(String...s){
        // 4 = 4*3*2*1

  Factorial f = new Factorial();
  f.getFactorial(5);

    }

    public void getFactorial(double value){
        double result=1 ;
        while(value>0) {
            result = result*value;
            value = value-1;
        }
        System.out.println("factorial of value :::"+result);

    }
}
