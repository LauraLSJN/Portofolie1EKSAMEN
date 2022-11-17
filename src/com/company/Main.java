package com.company;


public class Main {

    public static void main(String[] args) {

//Container Vessel
        System.out.println("ContainerVessel:");
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(4);
        c.utilityLevelOfCapacity();


//Tankers
        System.out.println("Tankers: ");
        Tankers t = new Tankers("DE", 15, 20, 20);
        t.loadingCargo(4, 3);
        System.out.println();
        t.utilityLevelOfCapacity();


//RoroVessel
        System.out.println("RoroVessel:");
        RoroVessel r = new RoroVessel("DK",10,10,10,300);
        r.loadingCargo(3,6);
        r.utilityLevelOfCapacity();

    }
}
