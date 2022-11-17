package com.company;

import java.util.Arrays;

public class Tankers extends Vessel {
    public int procent;
    private int compartments[] = new int[10];

    public Tankers(String flagNation, int aDraft, int length, int width) {
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        super.procent = procent;
    }

    public int[] getCompartments() {
        //System.out.println(Arrays.toString(compartments)); - Kan være nyttigt, hvis arrayet skal printes til terminalen

        return compartments;
    }

    public void loadingCargo(int compartmentsCapacity, int volumneLevel) {
      /*
       if (compartmentsCapacity > 10) {
            System.out.println("Tankeren har 1-10 comparments");
        }else if(compartmentsCapacity<1){
                System.out.println("The tankers have 1-10 comparments");
        }*/
        compartments[compartmentsCapacity] += volumneLevel;
        System.out.print("Compartments: ");
        for (int com : compartments) {
            System.out.print(com);
        }

    }

    @Override
    public void utilityLevelOfCapacity() {
        int count = 0;
        procent = 0;
        for (int com : compartments) {
            if (com == 0) {
                count++;
                procent = count * 100 / getCompartments().length;
            }
        }
        System.out.println("Andelen af tomme copartments: " + procent + "%");
    }
}
