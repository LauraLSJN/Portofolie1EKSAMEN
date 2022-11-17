package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    void mainTest(){

    }

    //Tester LoadingCargo()
    @Test
    void compartmentsTankerEmpty() {
        Tankers tanker = new Tankers("DE", 15, 20, 20);
        assertEquals(100, tanker.utilityLevelOfCapacity());
    }

    @Test
    void ContainerVesselEmpty(){
        containerVessel c = new containerVessel("DK",10,20);

        c.loadingCargo(0);
        c.utilityLevelOfCapacity();
        assertEquals(0,c.utilityLevelOfCapacity());
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
        RoroVessel r = new RoroVessel("DK",10,10,10,300);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(0,1);
        r.loadingCargo(1,0);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        r.loadingCargo(1,1);
        //r.loadingCargo(1,1);
        //r.loadingCargo(1,1);
        //r.loadingCargo(2,3);

       // r.utilityLevelOfCapacity();
        assertEquals(53,r.utilityLevelOfCapacity());

    }
    //skriv med 0 cargo -> 1 cargo og mange cargo
    // ingen grund til 2 eller 3 -> forventes de bliver behandlet ens.
    //1 og 2 er ikke det samme -> kan være en liste overskriver gammel fejl
    // 2 typer test:
    // bound value test -> kan man fylde max op, tester grænderne hvis max er 10, hvordan er 9 eller 10 så?
    // ECP test  -> opfører sig ens i forskellige situationer
    // ECP -> 0,1 og mange
    //

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


    //Måske ikke behov for
    @Test
    void testLoadingCargoCV(){
        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(9);
        assertEquals(9,c.getNowContainer());
    }

}
