package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Tankers extends Vessel {
    //public int procent;
    private int compartments[] = new int[10];
    private int maxCompartmentCapacity = 10; //Hver compartment kan fyldes til en hvis niveau -> Som vi har defineret til at være 10

    public Tankers(String flagNation, int aDraft, int length, int width) {
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        //super.procent = procent; //Kan slettes, da vi henter fra superklassen
    }

    public int[] getCompartments() {
        System.out.println(Arrays.toString(compartments)); //Nyttigt, hvis arrayet skal printes til terminalen fra en anden klasse eks. main
        return compartments; //GetCompartments, da vi skal teste det
    }

    public void loadingCargo(int compartmentsIndeks, int fillCompartment) { //Indeks repræsentere hver compartment
        //Tjekker om compartMentsIndeks i parameter, er indenfor array
        //Hvis loadingCargo skulle være med i superklassen, kunne vi undlade compartmentsIndeks og anvendt en sorterings algoritme, som fylder på næste ledige compartment
       if (compartmentsIndeks > 9) { //9, da array starter på indeks 0
            System.out.println("Tankeren har 1-10 comparments");
        }else if(compartmentsIndeks<0){
           System.out.println("The tankers have 1-10 comparments");
        }


        if(compartments[compartmentsIndeks] == 0){ //Fylder kun på, hvis værdien ved indeks x er 0. Værdien i array er ved default 0, hvilket repræsentere at compartment er "tom", der er altså ikke fyldt noget på
            //Plusser ikke op i antal pr. compartment, der allerede er lagt i. Vi kan derved ikke fylde 2+4 i samme indeks (compartment)
            if (fillCompartment <= maxCompartmentCapacity){ //Hvis fillCompartment (det der skal fyldes i) er mindre end eller lig med maxCompartmentCapacity
                compartments[compartmentsIndeks] += fillCompartment;
                System.out.print(" Compartments: ");
                for (int com : compartments) { //Foreach der printer arrayet
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

    @Override //Overrider fra Vessel
    public int utilityLevelOfCapacity() {
        int count = 0;
        //procent = 0; //Kan slettes, sat til 0 da vi ikke tog den fra superklassen
        for (int com : compartments) {
            if (com == 0) {
                count++;
                procent = count * 100 / compartments.length;
            }
        }
        System.out.println("Andel af tomme compartments: " + procent + "%");
        return procent;
    }

    //Part5: Dummy metoder
    public void findPositionTanker(){
        String position;

    }

    public void findFutureDestinationTanker(){
        ArrayList<String> futureDestinations;

    }
    public void searchAvailabeTanker(){
        ArrayList<String> availableTankers;

    }

    public void checkTankerCapacity(){
        int capacity;

    }

    public void addTransportation(){

    }

}


