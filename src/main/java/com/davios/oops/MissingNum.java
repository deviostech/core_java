package com.davios.oops;

public class MissingNum {

    public  static void  main (String...s){
        MissingNum m = new MissingNum();
        //int[] num = new int[]{2, 4, 6, 8, 12};
        //int[] num = new int[]{ 4, 8, 12,16,18};
        int[] num = new int[]{ 1,2,3,4,5,7,8,9};

        m.getMissingNum(num);

        int[] array={4,3,8,7,5,2,6};
        int missingNumber = findMissingNum(array);
        System.out.println("Missing Number is----> "+ missingNumber);
    }

    public static int findMissingNum(int[] array) {
        int n=array.length+1;
        int sumOfFirstNNums=n*(n+1)/2;
        int actualSumOfArr=0;
        for (int i = 0; i < array.length; i++) {
            actualSumOfArr+=array[i];
        }
        return sumOfFirstNNums-actualSumOfArr;
    }

    public void getMissingNum(int[] num){
            int diff =0;
            int previous_number =0;
        for (int i=0; i<=num.length-1;i++) {
            if(i==0) {
                int first = num[i];
                int second = num[i + 1];
                diff = second - first;
            }
                System.out.println("print series::"+num[i]);
            if(i!=0) {
                int expectedValue = num[i - 1] + diff;
                if (!(expectedValue == num[i])) {
                    System.out.println("missing number is ::" + expectedValue);
                    System.out.println("incorrect number is ::" + num[i]);
                }
            }

        }

    }

}
