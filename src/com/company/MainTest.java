package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    void mainTest(){
    }

    //Tankers
    //Tester hvis der ikke er nogle compartments, burde utility være 100%
    @Test
    void compartmentsTankerEmpty() {
        Tankers tanker = new Tankers("DE", 15, 20, 20);
        assertEquals(100, tanker.utilityLevelOfCapacity());
    }

    //Tester hvis vi kalder loadingCargo() 1 gang, forventes 90% tommer compartments
    @Test
    void compartmentsTanker90() {
        Tankers tanker = new Tankers("DE", 15, 20, 20);
        tanker.loadingCargo(0, 1);
        assertEquals(90, tanker.utilityLevelOfCapacity());
    }

    //Tester hvis Tankers compartments er fyldt op (alle 10 index) skal procent være 0%.
    @Test
    void compartmentsTankerMax() {
        Tankers tanker = new Tankers("DE", 15, 20, 20);
        tanker.loadingCargo(0, 1);
        tanker.loadingCargo(1, 1);
        tanker.loadingCargo(2, 1);
        tanker.loadingCargo(3, 1);
        tanker.loadingCargo(4, 1);
        tanker.loadingCargo(5, 1);
        tanker.loadingCargo(6, 1);
        tanker.loadingCargo(7, 1);
        tanker.loadingCargo(8, 1);
        tanker.loadingCargo(9, 1);
        assertEquals(0, tanker.utilityLevelOfCapacity());
    }


    //Vessel
    //Tester hvis der ikke er cargo på Vessel, burde utilitylevel være 0%
    @Test
    void containerVesselEmpty(){
        containerVessel c = new containerVessel("DK",10,20);
        assertEquals(0,c.utilityLevelOfCapacity());
    }

    //Tester hvis Vessel er fyldt op med 5 ud af max som er 10, skal utility level være på 50%.
    @Test
    void containerVesselFifty(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(50);
        assertEquals(50,c.utilityLevelOfCapacity());
    }

    //Tester hvis Vessel er fyldt helt op med 10, skal utilitylevel være 100%.
    @Test
    void containerVesselMax(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(5);
        c.loadingCargo(5);
        assertEquals(100,c.utilityLevelOfCapacity());
    }


    //Roro
    //Tester hvis roroVessel ikke har cars og trucks, er andelen af lanemeters fyldt: 0%
    @Test
    void RoroVesselEmpty(){
        RoroVessel r = new RoroVessel("DK",10,10,10,300);
        assertEquals(0,0);
    }

    //Tester hvis cars er sat til 10 og trucks er sat til 3, skal andel af lanemeters være fyldt med 56%
    @Test
    void RoroVesselFifty(){
        RoroVessel r = new RoroVessel("DK",10,10,10,300);
        r.loadingCargo(10,3);
        assertEquals(56,r.utilityLevelOfCapacity());
    }

    //Tester hvis cars er sat til 3 og trucks er sat til 9, skal andelen af lanemeters være fyldt med 98%
    @Test
    void RoroVesselMax(){
        RoroVessel r = new RoroVessel("DK",10,10,10,500);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(2,2);
        r.loadingCargo(1,1);
        r.loadingCargo(2,2);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        assertEquals(98,r.utilityLevelOfCapacity());
    }


    //Part 5: Dummy test
   //Tester hvis metoden forventer 0
    @Test
    void checkContainerVesselCapacityZero(){
        containerVessel c = new containerVessel("DK" , 10 ,10);
        assertEquals(0,c.checkContainerVesselCapacity());
    }

    //Tester hvis metoden forventer 1 - fejler da dummy metoden returnerer 0
    @Test
    void checkContainerVesselCapacityOne(){
        containerVessel c = new containerVessel("DK" , 10 ,10);
        c.checkContainerVesselCapacity();
        assertEquals(1,c.checkContainerVesselCapacity());
    }



    //Tester hvis metoden regner med at der er ingen ting i
    @Test
    void findPositionContainerVesselZero(){
        containerVessel c = new containerVessel("DK",10,10);
        assertEquals("",c.findPositionContainerVessel(""));
    }

    //Metoden fejler, da Mombasa ikke kan findes
    @Test
    void findPositionContainerVesselOne(){
        containerVessel c = new containerVessel("DK",10,10);
        c.findPositionContainerVessel("Mombasa");
        assertEquals("Mombasa",c.findPositionContainerVessel("Mombasa"));
    }

    @Test
    void findFutureDestinationsContainerVesselZero(){
        containerVessel c = new containerVessel("DK",10,10);
        assertEquals("", c.findFutureDestinationContainerVessel());
    }

    @Test
    void findFutureDestinationsContainerVesselOne() {
        containerVessel c = new containerVessel("DK", 10, 10);
        c.findFutureDestinationContainerVessel();
        assertEquals("", c.findFutureDestinationContainerVessel());
    }


    @Test
    void searchAvailbeContainerVesselZero(){
        containerVessel c = new containerVessel("DK", 10, 10);
        assertEquals("", c.searchAvailbeContainerVessel(""));
    }

    @Test
    void searchAvailbeContainerVesselOne(){
        containerVessel c = new containerVessel("DK", 10, 10);
        c.searchAvailbeContainerVessel("Mombasa");
        assertEquals("Mombasa", c.searchAvailbeContainerVessel("Mombasa"));
    }

}
