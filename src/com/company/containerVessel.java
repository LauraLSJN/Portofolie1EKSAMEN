package com.company;

public class containerVessel extends Vessel {
    private int nowContainer;
    private int maxContainer;
    public int procent;

    //Constructor
    public containerVessel(String flagNation, int length, int width) {
        super.flagNation = flagNation; //Fra Vessel (super klassen)
        super.length = length; //Fra Vessel (super klassen)
        super.width = width; //Fra Vessel (super klassen
        super.procent = procent;
        this.maxContainer = 10; // Specifik nummer til maxContainer
    }

    public int getNowContainer() {
        return nowContainer;
    }


    public void loadingCargo(int numberOfContainers){
        if (numberOfContainers < maxContainer && numberOfContainers > 0) {
            nowContainer = numberOfContainers;
        } else {
            System.out.println("Antallet af containere ikke muligt. Max. kapacitet: 10, Min. kapacitet: 0");
        }
        System.out.println("Antallet af Containere: " + numberOfContainers);
    }


    @Override
    public void utilityLevelOfCapacity() {
        nowContainer = getNowContainer();
        this.procent = nowContainer * 100 / maxContainer;
        System.out.println("Andelen af ContainerVessel der er fyldt: " + this.procent + "%");
    }


}
