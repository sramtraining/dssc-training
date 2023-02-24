package com.dssc.training;

import java.util.*;

public class Vamshi {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(453);
        mylist.add(111);
        mylist.add(222);
        mylist.add(333);
        mylist.add(444);
        mylist.add(453);
        for (int no: mylist) {
            System.out.println(no);
        }
        List<String> Strlist = new LinkedList<String>();
        Strlist.add("My first");
        Strlist.add("My second");
        Strlist.add("My Third");
        Strlist.add("My Fourth");
        Strlist.add("My Fifth");
        Strlist.add("My Sixth");
        Strlist.add("My Third");
        for (String str:Strlist) {
            System.out.println(str);
        }
        System.out.println(Strlist);

        Set<String> strset = new HashSet<String>();
        strset.add("Vamshi");
        strset.add("raja");
        strset.add("sunil");
        strset.add("gopi");
        strset.add("raja");
        strset.add("gopi");
        strset.add("sunil");
        for (String str:strset) {
            System.out.println("my friend is "+str);
        }
        System.out.println(strset);
        Set<Integer> intset = new TreeSet<Integer>();
        intset.add(143);
        intset.add(001);
        intset.add(100);
        intset.add(555);
        intset.add(323);
        intset.add(76);
        intset.add(100);
        for (Integer A:intset) {
            System.out.println("inserted no is "+A);
        }
        System.out.println(intset);
        Set<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        for (String B:al) {
        }

        Map<Integer, String> Mymap = new HashMap<Integer, String>();
        Mymap.put(232,"Maths");
        Mymap.put(007,"Polity");
        Mymap.put(123,"Maths");
        Mymap.put(523,"science");
        Mymap.put(300,"social");
        Mymap.put(143,"Polity");
        Mymap.put(232,"Hindi");
        for(Map.Entry<Integer, String> X:Mymap.entrySet()) {
            System.out.println("marks according to subjects are "+X);
        }
        System.out.println("Marks and  subjects :"+Mymap);
        Map<Integer,String> PV = new LinkedHashMap<Integer, String>();
        PV.put(1, "Tom");
        PV.put(22, "jerry is jerry");
        PV.put(2, "jerry is dangerous");
        PV.put(2, "jerry is sweet");
        PV.put(333, "null");
        PV.put(434, "null null");
        for ( Map.Entry<Integer, String> RRR :PV.entrySet()) {
            System.out.println("My latest LinkedHashMap is :" +RRR);
        }
        System.out.println(PV);

    }
}
