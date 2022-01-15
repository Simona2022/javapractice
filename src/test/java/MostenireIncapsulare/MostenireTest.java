package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {
    @Test
    public void testautomat(){
        Audi AudiA3= new Audi("hatchback","automata",
                "integrala",2,4,"rosu",
                Arrays.asList("interior piele","incalzire scaune","ventilatie","trapa"),
                4000,"A3");
        AudiA3.infoMasina();
        AudiA3.setCuloare("verde");
        AudiA3.infoMasina();
        AudiA3.pretFinal();

        Audi AudiA6= new Audi("hatchback","manuala",
                "integrala",4,5,"negru",
                Arrays.asList("interior piele","incalzire scaune","ventilatie","trapa"),
                7000,"Auris");
        AudiA6.infoMasina();

        Toyota Auris=new Toyota("hatchback","automata",
                "integrala",2,4,"rosu",
                Arrays.asList("interior piele","incalzire scaune","ventilatie","trapa"),
                4000,"Auris", "hibrid");
        Auris.infoMasina();


    }
}
