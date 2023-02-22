package com.dssc.training;

public class DataType {

    public static void main(String[] args) {
        //Datatype
        int i = 5;
        float f = 3.4f;
        double d = 5.4d;
        long l = 435l;
        boolean b = true;

        Integer I = new Integer(5);
        Integer I1 = 6;


        //Array
        int[] intArr = {3, 4, 5, 6};
        int[] intaar1 = new int[4];
        intaar1[0] = 4;
        intaar1[1] = 5;
        Integer[] integers = new Integer[4];


        //loops
        for (int i1 = 0; i1 < intArr.length; i1++) {
            System.out.println(intArr[i1]);
            System.out.println("End on " + i1);
        }


        int d1 = 0;
        while (d1 < intArr.length) {
            System.out.println(intArr[d1]);
            d1++;
        }

        for (Integer int1 : intArr) {
            System.out.println(int1);
        }


        //conditions
        if (I1 == i) {
            System.out.println("equal");
        } else if (I1 > i) {
            System.out.println("I1 is greater ");
        } else {
            System.out.println("I1 is lesser");
        }

    }
}
