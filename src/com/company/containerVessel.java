package com.company;

public class containerVessel extends Vessel {
    private int nowContainer;
    private int maxContainer;
    public int procent;
    int availableCapacity;
    int firstContainer;

    //Constructor
    public containerVessel(String flagNation, int length, int width) {
        super.flagNation = flagNation; //Fra Vessel (super klassen)
        super.length = length; //Fra Vessel (super klassen)
        super.width = width; //Fra Vessel (super klassen
        super.procent = procent;
        this.maxContainer = 10; // Specifik nummer til maxContainer
        //this.nowContainer = 0;
        this.firstContainer = 0;
    }


    public int getNowContainer() {
        return nowContainer;
    }


    public void loadingCargo(int numberOfContainers) {
        availableCapacity = maxContainer - nowContainer;
        if (nowContainer < maxContainer) {
            if (numberOfContainers <= availableCapacity) {
                nowContainer += numberOfContainers;
            } else {
                System.out.println("Antallet af containere ikke muligt. Max. kapacitet: 10, Min. kapacitet: 0");
            }
        } else {
            System.out.println("Der er allerede fyldt op");
        }

        if (nowContainer == maxContainer) {
            System.out.println("Der er præcis 10");
        }

    }


    @Override
    public int utilityLevelOfCapacity() {
        nowContainer = getNowContainer();
        procent = nowContainer * 100 / maxContainer;
        System.out.println("Andelen af ContainerVessel der er fyldt: " + procent + "%");
        return procent;
    }


}
