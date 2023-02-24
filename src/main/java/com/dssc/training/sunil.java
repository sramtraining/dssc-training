package com.dssc.training;

public class sunil {
    public static void main(String[] args) {
        //declare and initialize a string array
        String[] strArr = {"l","i", "n", "u", "s"};

        int strLen = strArr.length;  //get the length of array

        //
        System.out.println("The Given Array is:"+strArr);
        //display the length
        System.out.println("The Array Length Is: " + strLen);

        //Reverse the Array
        for (int i = strLen; i <=0 ; i--) {
            System.out.println(strArr[i]);
        }
    }
}
