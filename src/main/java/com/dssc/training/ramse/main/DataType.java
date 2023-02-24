package com.dssc.training.ramse.main;

import java.util.*;

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
            //      System.out.println(intArr[i1]);
            //      System.out.println("End on " + i1);
        }


        int d1 = 0;
        while (d1 < intArr.length) {
            //   System.out.println(intArr[d1]);
            d1++;
        }

        for (Integer int1 : intArr) {
            //    System.out.println(int1);
        }


        //conditions
        if (I1 == i) {
            System.out.println("equal");
        } else if (I1 > i) {
            //     System.out.println("I1 is greater ");
        } else {
            //      System.out.println("I1 is lesser");
        }


        // Collections  //22-Feb-2023

        //List -- ArrayList, LinkedList

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        if (list.contains(5)) {
            System.out.println("5 is present");
        }
        list.remove(3);

        for (Integer integer : list) {
            System.out.println("list " + integer);
        }

        List<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        for (Integer integer : linkedList) {
            //     System.out.println("linkedList " +integer);
        }


        //Set -- Hashset, LinkedSet, TreeSet

        Set<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(null);

        for (Integer integer : hashSet) {
            //   System.out.println("hashSet " +integer);
        }


        Set<Integer> linkedSet = new LinkedHashSet<Integer>();

        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(5);
        linkedSet.add(5);
        linkedSet.add(null);

        for (Integer integer : linkedSet) {
            //  System.out.println("linkedSet " +integer);
        }


        Set<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(4);
        treeSet.add(13);
        treeSet.add(73);
        treeSet.add(64);
        treeSet.add(53);
        treeSet.add(52);

        for (Integer integer : treeSet) {
            //  System.out.println("intTreeSet " +integer);
        }
        //Map -- Hashmap, LinkedHashMap, TreeMap --> Key,Value

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(22, "two is two");
        map.put(2, "two");
        map.put(2, "two is two");

        map.put(null, "null");
        map.put(null, "null null");


        for (Map.Entry<Integer, String> mapForEach : map.entrySet()) {
            //  System.out.println("Map Key " + mapForEach.getKey() + " Value " + mapForEach.getValue());
        }


        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1, "one");
        linkedHashMap.put(22, "two is two");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(2, "two is two");

        linkedHashMap.put(null, "null");
        linkedHashMap.put(null, "null null");

        for (Map.Entry<Integer, String> linkedMapForEach : linkedHashMap.entrySet()) {
            // System.out.println("LinkedMap Key " + linkedMapForEach.getKey() + " Value " + linkedMapForEach.getValue());
        }


        Map<Integer, String> TreeMap = new TreeMap<Integer, String>();

        TreeMap.put(1, "one");
        TreeMap.put(22, "two is two");
        TreeMap.put(4, "four");
        TreeMap.put(2, "two is two");


        for (Map.Entry<Integer, String> treeMapForEach : TreeMap.entrySet()) {
            System.out.println("TreeMap Key " + treeMapForEach.getKey() + " Value " + treeMapForEach.getValue());
        }
    }
}
