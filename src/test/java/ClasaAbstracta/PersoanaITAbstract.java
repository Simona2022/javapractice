package ClasaAbstracta;

import java.sql.SQLOutput;

public class PersoanaITAbstract extends PersoanaAbstract{
    public String nume;
    public String prenume;

    public PersoanaITAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void prioecteaza() {

    }

    @Override
    public void executie() {

    }

    @Override
    public void scriecod() {
        System.out.println("Persoana scrie cod");

    }

    @Override
    public void ruleazacod() {
        System.out.println("Persoana ruleaza cod");

    }
}
