package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    void mainTest(){

    }

    //Tester LoadingCargo()
    @Test
    void testLoadingCargoTankers() {
        Tankers tanker = new Tankers("DE", 15, 20, 20);
        tanker.loadingCargo(5,6);
        int[] tankerCompartments = tanker.getCompartments();
        assertEquals(6,tankerCompartments[5]);
    }

    @Test
    void ContainerVesselEmpty(){
        containerVessel c = new containerVessel("DK",10,20);

        c.loadingCargo(0);
        c.utilityLevelOfCapacity();
        assertEquals(0,c.utilityLevelOfCapacity());

        /*c.loadingCargo(5);
        c.utilityLevelOfCapacity();
        assertEquals(50,c.utilityLevelOfCapacity());*/

        /*c.loadingCargo(10);
        c.utilityLevelOfCapacity();
        assertEquals(100,c.utilityLevelOfCapacity());*/






        //containerVessel.utilityLevelOfCapacity();
        //assertEquals(0,0);


    }
    @Test
    void containerVesselFifty(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(5);
        c.utilityLevelOfCapacity();
        assertEquals(50,c.utilityLevelOfCapacity());
    }



    @Test
    void containerVesselMax(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(10);
        c.utilityLevelOfCapacity();
        assertEquals(100,c.utilityLevelOfCapacity());
    }

    @Test
    void testLoadingCargoCV(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(9);
        assertEquals(9,c.getNowContainer());
    }

    @Test
    void testLoadingCargoRORO(){
        RoroVessel RR = new RoroVessel("DK",10,10,10,300);
        RR.loadingCargo(3,6);
        assertEquals(6,RR.getTruck());
        assertEquals(3,RR.getCar());
    }



    //Tester utilityLevelOfCapacity()
    @Test
    void testUtilityCV(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(5);
        c.utilityLevelOfCapacity();
        assertEquals(50,c.procent);
    }

    @Test
    void testUtilityCTankers(){
        Tankers t = new Tankers("DE", 15, 20, 20);
        t.loadingCargo(1, 1);
        t.utilityLevelOfCapacity();
        assertEquals(90,t.procent);
    }

    @Test
    void testUtilityRORO(){
        RoroVessel RORO = new RoroVessel("DK",10,10,10,300);
        RORO.loadingCargo(1,1);
        RORO.utilityLevelOfCapacity();
        assertEquals(12,RORO.procent);

    }

    //Tester at længden på Array er som forventet (Klassen)
    @Test
    void testGetCompartmentsTankers(){
        Tankers t = new Tankers("DE", 15, 20, 20);
        assertEquals(10,t.getCompartments().length);
    }

}
