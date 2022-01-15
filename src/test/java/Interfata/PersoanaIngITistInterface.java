package Interfata;

import java.sql.SQLOutput;

public class PersoanaIngITistInterface extends PersoanaInterface implements Inginer, ITist{
    public PersoanaIngITistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scriecod() {
        System.out.println("Persoana scrie cod");

    }

    @Override
    public void ruleazateste() {
        System.out.println("Persoana ruleaza");

    }

    @Override
    public void proiecteaza() {
        System.out.println("Persoana proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("Persoana executa");

    }
}
