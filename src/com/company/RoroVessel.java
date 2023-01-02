package com.company;

import java.util.ArrayList;

public class RoroVessel extends Vessel {

    private int totalAmountLaneMeters;
    private int car;
    private int truck;
    private int carLength = 8;
    private int truckLength = 30;
    //public int procent; //Kan slettes, da vi henter fra superklassen
    int ledigKapacitet;
    int carTruckTotalLaneMeters;

    public RoroVessel(String flagNation, int aDraft, int length, int width, int totalAmountLaneMeters) {
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        this.totalAmountLaneMeters = totalAmountLaneMeters; //totalAmountLaneMeters indgår i ovenstående parameter, da der ikke er givet specifik længde i opgavebeskrivelsen. Skibene kan have forskellige længder, skal derfor sættes
        //super.procent = procent; //Kan slettes, da vi henter fra superklassen
    }


    public void loadingCargo(int cars, int trucks) { //cars og trucks kan ændres til eks. newLoadCar og newLoadTrucks -> Da disse anvendes i nedenstående beregninger
       int newLoadCar = cars; //Redundant -> Da vi ligger cars og trucks i nye variabler -> Argumenterne i parametren, er i sig selv en variabel
       int newLoadTruck = trucks; //Redundant -> Da vi ligger cars og trucks i nye variabler -> Argumenterne i parametren, er i sig selv en variabel
        int newLoadLaneMeters = (newLoadCar * carLength) + (newLoadTruck * truckLength); //TotalLaneMeters der ønskes at tilføjes
        carTruckTotalLaneMeters = (car * carLength) + (truck * truckLength); //TotalLaneMeters for alle car og truck tilføjet
        ledigKapacitet = totalAmountLaneMeters - carTruckTotalLaneMeters; //LedigKapacitet tilbage - totalAmountLaneMeters -> Angivet i konstruktøren

        if (ledigKapacitet >= 0 && totalAmountLaneMeters > carTruckTotalLaneMeters) { //Hvis der er en ledig kapacitet og totalAmountLanemeters (i konstruktøren) er større end allerede fyldte totalAmountLanemeters
            //ledigKapacitet >= 0 kan slettes
            if (newLoadLaneMeters < ledigKapacitet) { //Det ønskede antal cars og trucks der skal tilføjes skal være mindre end ledig kapacitet
                //Ovenstående if-statement kunn være blevet lagt sammen; totalAmountLaneMeters > carTruckTotalLanemeters && newLoadLanemeters < ledigKapacitet
                car += newLoadCar; //tilføjer newLoadCar til variabel car
                truck += newLoadTruck; //tilføjer newLoadTruck til variabel truck
                System.out.println("Car: " + car + " Truck: " + truck);
                System.out.println("newLoadLaneMeters: " + newLoadLaneMeters);
                System.out.println("carTruckTotalLaneMeters: " + carTruckTotalLaneMeters);
                //carTruckTotalLaneMeters = (car * carLength) + (truck * truckLength); //Opdaterer carTruckTotalLaneMeters - Kan SLETTES, vi havde den fordi vi oplevede at det ikke virkede
               //ledigKapacitet = totalAmountLaneMeters - carTruckTotalLaneMeters; //Opdaterer ledigKapacitet -  Kan SLETTES, oplevede at det nogle gange ikke virkede
                System.out.println("LedigKapacitet: " + ledigKapacitet);

                System.out.println();
            } else {
                System.out.println("Der er ikke plads");
            }

        }
    }


    @Override
    public int utilityLevelOfCapacity() {
        procent = carTruckTotalLaneMeters * 100 / totalAmountLaneMeters; //Procent andel som anvedes
        System.out.println("Andel af lanemeters fyldt: " + procent + "%");
        return procent;
    }

    //Part5: Dummy metoder
    public void findPositionRoro(){
        String position;

    }

    public void findFutureDestinationRoro(){
        ArrayList<String> futureDestinations;

    }
    public void searchAvailbeRoro(){
        ArrayList<String> availableRoro;

    }

    public void checkRoroCapacity(){
        int capacity;

    }

    public void addTransportation(){

    }




















}
