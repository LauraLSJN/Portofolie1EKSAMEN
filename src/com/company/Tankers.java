package com.company;

import java.util.Arrays;

public class Tankers extends Vessel {
    public int procent;
    private int compartments[] = new int[10];
    private int maxCompartmentCapacity = 10;

    public Tankers(String flagNation, int aDraft, int length, int width) {
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        super.procent = procent;
    }

    public int[] getCompartments() {
        System.out.println(Arrays.toString(compartments)); //Kan være nyttigt, hvis arrayet skal printes til terminalen
        return compartments; //GetCompartments, da vi skal teste det
    }

    public void loadingCargo(int compartmentsIndeks, int fillCompartment) {


/*
        if (compartments[compartmentsIndeks]> 10) {
            System.out.println("Tankeren har 1-10 comparments");
        }else if(compartments[compartmentsIndeks]<1){
            System.out.println("The tankers have 1-10 comparments");
        }*/


       if (compartmentsIndeks > 10) {
            System.out.println("Tankeren har 1-10 comparments");
        }else if(compartmentsIndeks<1){
                System.out.println("The tankers have 1-10 comparments");
        }


        /*compartments[compartmentsIndeks] += volumneLevel;
        System.out.println(" Compartments: ");
        for (int com : compartments) {
            System.out.print(com);
        }*/

        if(compartments[compartmentsIndeks] == 0){
           if (fillCompartment <= maxCompartmentCapacity){
                compartments[compartmentsIndeks] += fillCompartment;
                System.out.print(" Compartments: ");
                for (int com : compartments) {
                    System.out.print(com);

                }
            } else {
               System.out.println("fillCompartment er for meget ift. maxCompartmentCapacity");
           }
            System.out.println();
        }else{
            System.out.println("Der er allerede en på pladsen");
        }






    }

    @Override
    public int utilityLevelOfCapacity() {
        int count = 0;
        procent = 0;
        for (int com : compartments) {
            if (com == 0) {
                count++;
                procent = count * 100 / compartments.length;
            }
        }
        System.out.println("Andelen af tomme copartments: " + procent + "%");
        return procent;
    }
}
