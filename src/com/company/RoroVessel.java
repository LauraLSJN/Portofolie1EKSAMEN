package com.company;

public class RoroVessel extends Vessel {

    private int totalAmountLaneMeters;
    private int car;
    private int truck;
    private int carLength = 8;
    private int truckLength = 30;
    public int procent;
    int ledigKapacitet;
    int carTruckTotalLaneMeters;

    public RoroVessel(String flagNation, int aDraft, int length, int width, int totalAmountLaneMeters) {
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        this.totalAmountLaneMeters = totalAmountLaneMeters;
        super.procent = procent;
    }


    public void loadingCargo(int cars, int trucks) {
        int newLoadCar = cars;
        int newLoadTruck = trucks;
        int newLoadLaneMeters = (newLoadCar * carLength) + (newLoadTruck * truckLength); //TotalLaneMeters der ønskes at tilføjes
        carTruckTotalLaneMeters = (car * carLength) + (truck * truckLength); //TotalLaneMeters for alle car og truck tilføjet
        ledigKapacitet = totalAmountLaneMeters - carTruckTotalLaneMeters; //LedigKapacitet tilbage

        if (ledigKapacitet >= 0 && totalAmountLaneMeters > carTruckTotalLaneMeters) {
            if (newLoadLaneMeters < ledigKapacitet) { //Den ønskede værdi der skal tilføjes skal være mindre end ledig kapacitet
                car += newLoadCar; //tilføjer newLoadCar til variablen car
                truck += newLoadTruck; //tilføjer newLoadTruck til variablen truck
                System.out.println("Car: " + car + " Truck: " + truck);
                System.out.println("newLoadLaneMeters: " + newLoadLaneMeters);
                System.out.println("carTruckTotalLaneMeters: " + carTruckTotalLaneMeters);
                carTruckTotalLaneMeters = (car * carLength) + (truck * truckLength); //Opdaterer carTruckTotalLaneMeters
                ledigKapacitet = totalAmountLaneMeters - carTruckTotalLaneMeters; //Opdaterer ledigKapacitet
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
