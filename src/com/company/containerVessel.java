package com.company;
import java.util.ArrayList;

public class containerVessel extends Vessel {
    private int nowContainer; //Eksisterende fyldte containers
    private int maxContainer;
    //public int procent; //Kan slettes, da vi henter fra superklassen
    int availableCapacity;
    //int firstContainer; //Anvendes ikke

    //Constructor
    public containerVessel(String flagNation, int length, int width) {
        super.flagNation = flagNation; //Fra Vessel (super klassen)
        super.length = length; //Fra Vessel (super klassen)
        super.width = width; //Fra Vessel (super klassen
        //super.procent = procent;
        this.maxContainer = 10; // Specifik nummer til maxContainer
        //this.firstContainer = 0; //Anvendes ikke
    }


    public int getNowContainer() { //Anvendes i main, så nowContainer, kan printes i konsollen
        return nowContainer;
    }

    public void loadingCargo(int numberOfContainers) { //Void da det ikke skal returnere en værdi
        availableCapacity = maxContainer - nowContainer; //Finder kapaciteten -> Eksisterende plads til at fylde containers i
        //Nested if-else
        if (nowContainer < maxContainer) { //Er der overhovedet plads
            if (numberOfContainers <= availableCapacity) { //Tjekker om det antal containers man ønsker at fylde er mindre end eller lig ledig kapacitet -> Er der overhovedet plads
                nowContainer += numberOfContainers; //Hvis der er plads -> tilføjes antal ønsket containers, til det nuværende/eksisterende antal containers
            } else {
                System.out.println("Antallet af containere ikke muligt. Max. kapacitet: 10, Min. kapacitet: 0");
            }
        } else {
            System.out.println("Der er allerede fyldt op");
        }

        //Nedenstående informere kun og udfører ikke anden handling
        if (nowContainer == maxContainer) {
            System.out.println("Der er præcis 10");
        }

    }

    @Override //Overrider fra superklassens abstrakte metode
    public int utilityLevelOfCapacity() {
        procent = nowContainer * 100 / maxContainer; //Procent erklæret i superklassen
        System.out.println("Andelen af ContainerVessel der er fyldt: " + procent + "%"); //Ikke nødvendigt i denne klasse -> Kunne være implmenteret i main
        return procent;
    }

    //Part5: Dummy metoder
    public String findPositionContainerVessel(String vesselName){
        String position = "";
        return position;

    }

    public ArrayList<String> findFutureDestinationContainerVessel(){
        ArrayList<String> futureDestinations = new ArrayList<String>();
        return futureDestinations;

    }
    public ArrayList<String> searchAvailbeContainerVessel(String vesselName){
        ArrayList<String> availableContainerVessel = new ArrayList<String>();
        return availableContainerVessel;
    }

    public int checkContainerVesselCapacity(){
        int capacity = 0;
        return capacity;
    }

    public void addTransportation(){

    }

}
