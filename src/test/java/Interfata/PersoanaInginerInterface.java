package Interfata;

import java.sql.SQLOutput;

public class PersoanaInginerInterface extends PersoanaInterface implements Inginer{

    public PersoanaInginerInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("inginerul proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("inginerul executa");

    }
}
