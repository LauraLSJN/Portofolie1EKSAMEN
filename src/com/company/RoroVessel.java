package com.company;

public class RoroVessel extends Vessel {

    private int totalAmountLaneMeters;
    private int car;
    private int truck;
    private int carLength = 8;
    private int truckLength = 30;
    public int procent;


    public RoroVessel(String flagNation, int aDraft, int length, int width, int totalAmountLaneMeters) {
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        this.totalAmountLaneMeters = totalAmountLaneMeters;
        super.procent = procent;
    }

    public int getCar() {
        return car;
    }

    public int getTruck() {
        return truck;
    }

    public void loadingCargo(int cars, int trucks) {
        this.car = cars;
        this.truck = trucks;
        System.out.println("Antallet af Cars: " + cars + ", Antallet af Trucks: " + trucks);
    }

    @Override
    public void utilityLevelOfCapacity() {
        int totalAmountCarTruck = (getCar()*carLength) + (getTruck() * truckLength);
        procent = totalAmountCarTruck * 100 / totalAmountLaneMeters; //Procent andel som anvedes
        System.out.println("Andelen af fyldt Lanemeter: " + procent + "%");
    }

}
