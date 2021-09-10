package com.davios.oops;

public class Palindrom {

    public static void  main(String...s){

        Palindrom p = new Palindrom();
        p.printPalindrome("MODIDOM");
    }


    public void printPalindrome(String value){
        //MADAM //chaahc
        System.out.println("print before check palindrome :: " +value);
        StringBuilder revers = new StringBuilder();

        for (int i=0 ; i<=value.length()-1; i++){
            revers.append(value.charAt(value.length()-i-1));
        }
        if(value.equals(revers.toString()))
        {
            System.out.println("given string is palindrome::"+revers);
        }

    }


}
