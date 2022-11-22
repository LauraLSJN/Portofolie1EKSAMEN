package com.company;


public class Main {

    public static void main(String[] args) {

//Container Vessel
        System.out.println("ContainerVessel:");
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(4);
        System.out.println("Antal containers i ContainerVessel: " + c.getNowContainer());
        c.utilityLevelOfCapacity();


//Tankers
        System.out.println();
        System.out.println("Tankers: ");
        Tankers t = new Tankers("DE", 15, 20, 20);
        t.loadingCargo(1, 3);
        t.loadingCargo(2, 4);
        t.loadingCargo(3,2);
        System.out.println();
        t.utilityLevelOfCapacity();


//RoroVessel
        System.out.println();
        System.out.println(" RoroVessel:");
        RoroVessel r = new RoroVessel("DK",10,10,10,500);
        r.loadingCargo(1,1);
        r.loadingCargo(2,1);
        r.loadingCargo(3,1);
        r.loadingCargo(3,1);
        r.loadingCargo(3,1);
        r.loadingCargo(3,1);
        r.loadingCargo(3,1);
        r.loadingCargo(3,1);
        r.utilityLevelOfCapacity();

    }
}
