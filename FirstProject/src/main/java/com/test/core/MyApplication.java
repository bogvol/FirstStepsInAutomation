package com.test.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Kengoroo on 09.01.2015.
 */
public class MyApplication {
    public static void main(String[] args) {
        List<Furniture> myFurn = new ArrayList<Furniture>();

        Chair ivanChair = new Chair();
        ivanChair.setOwner("Ivan");
        ivanChair.setWeight(120);

        Table ivanTable;
        ivanTable = new Table("pink", 7);
        ivanTable.setOwner("Ivan");

        Chair olegChair = new Chair();
        olegChair.setOwner("Oleg");
        olegChair.setWeight(130);

        Table olegTable = new Table();
        olegTable.setOwner("Oleg");
        olegTable.setColor("gold");
        olegTable.setSize(4);

        myFurn.add(ivanChair);
        myFurn.add(ivanTable);
        myFurn.add(olegChair);
        myFurn.add(olegTable);
// зробити виведення на екран списку мебелі(стільці, столи) і їх параметрів. використати foreach для system.out і подивитися його конструкцію в інеті.
        for (Furniture i : myFurn){
            System.out.println(i);
        }

        //System.out.println(ivanChair);
       // System.out.println(olegChair);
       // System.out.println(ivanTable);
      //  System.out.println(olegTable);
    }
}
