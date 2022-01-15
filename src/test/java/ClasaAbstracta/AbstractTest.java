package ClasaAbstracta;

import org.junit.Test;

public class AbstractTest {
    @Test
    public void testautomat(){
        PersoanaInginerAbstract Gigi=new PersoanaInginerAbstract("Gigi","Matei");
        Gigi.afiseazavarsta(23);
        Gigi.prioecteaza();
        Gigi.executie();
        PersoanaITAbstract Vasi= new PersoanaITAbstract("Vasi","Petre");
        Vasi.ruleazacod();
        Vasi.scriecod();
        PersoanaINGIT Vio=new PersoanaINGIT ("Maria", "Gigi");
        Vio.executie();
        Vio.prioecteaza();
        Vio.scriecod();
        Vio.ruleazacod();
        Vio.afiseazavarsta(27);
    }
}
