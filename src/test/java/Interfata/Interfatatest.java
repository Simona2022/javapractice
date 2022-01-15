package Interfata;

import org.junit.Test;

public class Interfatatest {
    @Test
    public void testautomat(){
        PersoanaInginerInterface Simona= new PersoanaInginerInterface("Andrei", "Simona");
        Simona.executie();
        Simona.proiecteaza();

        PersoanaITistInterface Simonaa=new PersoanaITistInterface("Andrei", "Simona");
        Simonaa.scriecod();
        Simonaa.ruleazateste();

        PersoanaIngITistInterface Gabriela=new PersoanaIngITistInterface("Andrei","Simona");
        Gabriela.executie();
        Gabriela.proiecteaza();
        Gabriela.scriecod();
        Gabriela.ruleazateste();
    }
}
