package com.company;

public class RoroVessel extends Vessel {

    private int totalAmountLaneMeters;
    private int car;
    private int truck;
    private int carLength = 8;
    private int truckLength = 30;
    public int procent;
   //int totalAmountCarTruck;
    int totalAmountCarTruck;



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
        totalAmountCarTruck = (getCar()*carLength) + (getTruck() * truckLength);  

       //availablecapacity = hvor mange meter der er tilbage på rorovessel efter bilers og trucks længder.
        int availableCapacity =  totalAmountLaneMeters - totalAmountCarTruck;



        if(totalAmountCarTruck < totalAmountLaneMeters){ // hvis der er mere plads efter trucks og cars er sat
            System.out.println("TOTAL AMOUNT CAR TRUCK lane meters: " + totalAmountCarTruck);
            if(totalAmountCarTruck < availableCapacity){ // hvis trucks og bilers længde er mindre end eller lig med at der er mere plads
                this.car += cars;
                this.truck += trucks;
                System.out.println("TOTAL AMOUNT CAR TRUCK: " + totalAmountCarTruck);
            }

        }  else {
            System.out.println("Der er ikke plads");
        }



      /*  if (availableCapacity<totalAmountLaneMeters){
            System.out.println("Ikke plads nok");
        } else {
            this.car = cars;
            this.truck = trucks;
            System.out.println("Antallet af Cars: " + cars + ", Antallet af Trucks: " + trucks);
        }  */


       // summen af længden på cars og truck mindre end totaleLanemeters
        //Available capacity += summen af længden ovenstående - totallanemeters

        //if (availabecapacity mindre end totalelanemerts


        /* availableCapacity = maxContainer - numberOfContainers;
        if(availableCapacity >= numberOfContainers){
            nowContainer +=numberOfContainers;
        } else {
            System.out.println("Antallet af containere ikke muligt. Max. kapacitet: 10, Min. kapacitet: 0");
        }
        */



        //this.car = cars;
        //this.truck = trucks;
        System.out.println("Antallet af Cars: " + cars + ", Antallet af Trucks: " + trucks);
    }

    @Override
    public int utilityLevelOfCapacity() {
      //  (biler * længde) + (truck * længde)
        //int totalAmountCarTruck = (getCar()*carLength) + (getTruck() * truckLength);
        procent = totalAmountCarTruck * 100 / totalAmountLaneMeters; //Procent andel som anvedes
        System.out.println("Andelen af fyldt Lanemeter: " + procent + "%");
        return procent;
    }

}
