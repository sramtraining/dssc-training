package com.dssc.training;

public class Gopichander {

    public static void main(String[] args) {
        //Datatype
        //Primitive Datatypes
        int i = 2;
        float f = 2.4f;
        double d = 4.4d;
        long l = 234l;
        boolean b = false;
        char g = '2';
        Integer I = new Integer(4);
        Integer I1 = 4;


        //Array
        //Non-primitive Datatypes
        int[] intArr = {5, 6, 7, 8};
        System.out.println(intArr[3]);
        int[] intaar1 = new int[4];
        intaar1[0] = 4;
        intaar1[1] = 5;
        Integer[] integers = new Integer[4];
        String x = "Gopichander, 2, yes";

        //loops
        for (int i1 = 0; i1 < intArr.length; i1++)
        {
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

