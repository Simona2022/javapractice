package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;

public class CursantTest {
    @Test
    public void testautomat(){
        System.out.println("---obiectul1---");
        Cursant Simona=new Cursant("Andrei", "Simona", 26,2.500, 'F', false, Arrays.asList("Automation","Manual","Java"));
        Simona.dateCursant();
        Simona.verificadiplomabac();
        System.out.println("---obiectul 1 modificat---");
        Simona.prenume="Simona-Gabriela";
        Simona.dateCursant();

        System.out.println("---obiectul2---");
        Cursant CorneliaGrab= new Cursant("Grab", "Cornelia", 22, 2.500, 'F',true, Arrays.asList("Automation", "Manual"));
        CorneliaGrab.dateCursant();
        CorneliaGrab.verificadiplomabac();

        System.out.println("---obiectul3---");
        Cursant Alex= new Cursant("Dorha","Alex", 25,'M',true, Arrays.asList("Automation", "manual"));
        Alex.dateCursant();
        Alex.verificadiplomabac();

        System.out.println("---obiectul4---");
        Cursant Alexandru=new Cursant("Andrei", "Andrei", 28, 2.500, 'M',true, "Automation");
        Alexandru.dateCursant();
    }


}
