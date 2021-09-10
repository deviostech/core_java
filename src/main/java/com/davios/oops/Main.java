package com.davios.oops;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static final String XXXX = "XXXX";

    public static void main(String...s)
    {
        Parent p = new Parent();
        Parent pp = new Child();
        Child c = new Child();
        p.add();
        pp.add();
        pp.override();
        c.child();
        c.override();
        p.staticM();
        pp.staticM();
        c.staticM();
        Parent.staticM();
        Child.staticM();
        //Pass the reference to updateObject Method
        CallByValue ibTestObj = new CallByValue(20);
        updateObject(ibTestObj);
        //After the updateObject is executed, check for the value of num in the object.
        System.out.println(ibTestObj.num);//corresponding ASCII values of each character

        Main main = new Main();
        String XXXX ="XXXX";
        System.out.println(main.isContainXXXXValue(XXXX,XXXX));
        System.out.println(main.isContainXXXXValue(XXXX,"test"));
        System.out.println(main.isContainXXXXValue("TEST",XXXX));
        System.out.println(main.isContainXXXXValue("Test","test"));
        System.out.println(main.isContainXXXXValue(null,null));
        System.out.println(main.isContainXXXXValue(null,XXXX));
        System.out.println(main.isContainXXXXValue(XXXX,null));
        main.stringLetral();
        main.variableAurg("hello","varAur","testValue");
        main.variableAurg("1","2","3","4","5");
        System.out.println('b' + 'i' + 't');
    }
    public static void updateObject(CallByValue ibObj)
    {
        // Point the object to new reference
        ibObj = new CallByValue();
        // Update the value
        ibObj.num = 50;
        System.out.println(ibObj.num);
        System.out.println(ibObj.getClass().getName());
        int[] x = new int[3];
        Integer i =2;
        Object obj = new Object();
        System.out.println(x.getClass().getName());
        System.out.println(i.getClass().getName());
        System.out.println(obj.getClass().getName());



    }

    public boolean isContainXXXXValue(String mic , String opol){
        return StringUtils.equals(mic,XXXX);


}

    public void stringLetral(){

        String s ="test";
        String s1 = "test";
        String s2 = new String("test");
        String s3 = new String ("test");
         if (s==s1)
         {
             System.out.println("equalPool");

         }
        if (s.equals(s2))
        {
            System.out.println("equalPoolHeap");

        }
        if (s2.equals(s3))
        {
            System.out.println("equalHeap");

        }
    }


    public void variableAurg(String...test){
        for (String arg:test
             ) {
            System.out.println(arg);
        }
    }
}
