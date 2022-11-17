package com.company;


public class Main {

    public static void main(String[] args) {

//Container Vessel
        System.out.println("ContainerVessel:");
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(4);
        //c.loadingCargo(3);
        //c.loadingCargo(3);
        System.out.println("Antal containers i ContainerVessel: " + c.getNowContainer());
        c.utilityLevelOfCapacity();


//Tankers
        System.out.println();
        System.out.println("Tankers: ");
        Tankers t = new Tankers("DE", 15, 20, 20);
        t.loadingCargo(1, 3);
        t.loadingCargo(2, 4);
        t.loadingCargo(2,4);
        t.loadingCargo(3,2);
      //  t.loadingCargo(11,2);
      //t.loadingCargo(5, 11);
        //t.loadingCargo(11, 4);
        System.out.println();
        t.utilityLevelOfCapacity();


//RoroVessel
        System.out.println();
        System.out.println(" RoroVessel:");
        RoroVessel r = new RoroVessel("DK",10,10,10,500);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
       // r.loadingCargo(0,0);
        //r.loadingCargo(3,3);

        //r.loadingCargo(2,2);
        r.utilityLevelOfCapacity();

    }
}
