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
//Hvis mere tid -> smid en try-catch på
       if (compartmentsIndeks > 9) {
            System.out.println("Tankeren har 1-10 comparments");
        }else if(compartmentsIndeks<0){
           System.out.println("The tankers have 1-10 comparments");
        }


        if(compartments[compartmentsIndeks] == 0){ //Fylder kun på, hvis værdien ved indeks x er 0
            //Plusser ikke op i antal, der allerede er lagt i. Vi kan derved ikke fylde 2+4 i samme indeks (compartment)
           if (fillCompartment <= maxCompartmentCapacity){
                compartments[compartmentsIndeks] += fillCompartment;
                System.out.print(" Compartments: ");
                for (int com : compartments) {
                    System.out.print(com);
                }
            } else {
               System.out.println("Du overskrider max level for compartment");
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
        System.out.println("Andel af tomme copartments: " + procent + "%");
        return procent;
    }
}
