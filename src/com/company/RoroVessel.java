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
    int nowTotalAmountCarTruck;
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

    public int getCar() {
        return car;
    }

    public int getTruck() {
        return truck;
    }



    public void loadingCargo(int cars, int trucks) {
        int newLoadCar = cars;
        int newLoadTruck = trucks;
        ledigKapacitet = totalAmountLaneMeters - carTruckTotalLaneMeters;
        if(ledigKapacitet >= 0 && totalAmountLaneMeters > carTruckTotalLaneMeters){
            car +=newLoadCar;
            truck += newLoadTruck;
            System.out.println("Car: " + car + " Truck: " + truck);
            carTruckTotalLaneMeters = (car*carLength) + (truck*truckLength);

        }else{
            System.out.println("Der er ikke plads");
        }

        System.out.println("LedigKapacitet: " + ledigKapacitet);
        System.out.println("carTruckTotalLaneMeters: " + carTruckTotalLaneMeters);












        /*int nowCar = cars;
        int nowTruck = trucks;

        nowTotalAmountCarTruck = (nowCar*carLength) + (nowTruck * truckLength);
        totalAmountCarTruck = (car*carLength) + (truck * truckLength);


       //availablecapacity = hvor mange meter der er tilbage på rorovessel efter bilers og trucks længder.
        int availableCapacity =  totalAmountLaneMeters - totalAmountCarTruck;
        //int availableCapacity =  availableCapacityStart - nowTotalAmountCarTruck;



        System.out.println();
        //System.out.println("Start amount of lanemeters: " + totalAmountLaneMeters);
        //System.out.println("Lanemeters start: " + availableCapacity);
        //System.out.println("Lanemeters tilbage: " + nowavailableCapacity);
        //System.out.println();
       // Bliver ikke printet rigtigt ud - Skal tjekkes.

        if((totalAmountCarTruck < totalAmountLaneMeters) && (nowTotalAmountCarTruck < totalAmountLaneMeters)){ // hvis der er mere plads efter trucks og cars er sat
        //nowTotalAmountCarTruck
       // int nowAvailableCapacity = availableCapacity- nowTotalAmountCarTruck;//
          //  if((totalAmountCarTruck <= availableCapacity) && (totalAmountCarTruck <= nowAvailableCapacity))

            if(totalAmountCarTruck <= availableCapacity){ // hvis trucks og bilers længde er mindre end eller lig med at der er mere plads
                  this.car += nowCar;
                  this.truck += nowTruck;
                System.out.println("Nuværende antal af Cars: " + this.car + ", antal af Trucks: " + this.truck);
                   totalAmountCarTruck = totalAmountCarTruck + nowTotalAmountCarTruck;


                  //  nowAvailableCapacity = nowAvailableCapacity - totalAmountCarTruck;

                    // 500 - totalamountcartruck  = resterende
                    // availanlecapacity = ava - nowtotalamountcartruck


                //totalamountlane meters 500 = skal minus med nowtotalamountcartruck
                 //  totalAmountLaneMeters = totalAmountLaneMeters - totalAmountCarTruck;
                    //Now availible = availibleCapacity - total amountOfcarsTrucks

               System.out.println("Total amount lane meters: " + totalAmountLaneMeters);
              //  System.out.println("availbleCapacity " + availableCapacity);
                System.out.println("Total Amount Car Truck: " + totalAmountCarTruck);
                //System.out.println("Total availble: " + nowAvailableCapacity);
                System.out.println("Now Amount Car Truck : " + nowTotalAmountCarTruck );
                System.out.println("Availbe capacity LEFT: " + availableCapacity);
              //  System.out.println("Now availbe: "  + nowAvailableCapacity);

                //System.out.println("Nuværende total lanemeters for Cars & Trucks: " + totalAmountCarTruck);


            }

        }  else {
            System.out.println("Der er ikke plads");
        }*/




       // System.out.println("Lanemeters tilbage: " + availableCapacity);
       // System.out.println();


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
     //   System.out.println("Antallet af Cars: " + cars + ", Antallet af Trucks: " + trucks);
    }

    @Override
    public int utilityLevelOfCapacity() {
      //  (biler * længde) + (truck * længde)
        //int totalAmountCarTruck = (getCar()*carLength) + (getTruck() * truckLength);

        procent = carTruckTotalLaneMeters * 100 / totalAmountLaneMeters; //Procent andel som anvedes
        System.out.println("Andel af lanemeters fyldt: " + procent + "%");
        return procent;
    }

}
