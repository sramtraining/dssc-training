package com.dssc.training;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    /*
     primtive: byte,short,int,long,fload,double
     wrrapper class: Byte,Integer,Long,Float,Double
     Object type  : Arryalist, arr[]
     public,protected,default(frindly),private
     reutrntype : primtive, wrapper classes, objectypes,void
     Modifier retuntype MehtodName(){

    }
   */
    public void printArrayList(){
        ArrayList list=new ArrayList();
        list.add("gopi");
        list.add("Raja");
        list.add("Rithwik");
        list.add("Vamshi");
        list.add("Sunil");
        list.add("Chaitanya");
        System.out.println("gopi is Present");
        for (Object obj:list)
        {
            if(((String)obj).equalsIgnoreCase("Gopi")){
                System.out.println("Present" + list);
            }
            System.out.println(obj);
        }
    }
    public static void main(String str[]){
        Collections obj=new Collections();
        obj.printArrayList();

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("ASKConsulting");
        linkedList.add("Hexaware");
        linkedList.add("NityoInfotech");
        linkedList.add("TanishaSystems");
        linkedList.add("Absoluting");
        for (String string :linkedList){
            System.out.println("linkedList" + string);
        }

    }

}

