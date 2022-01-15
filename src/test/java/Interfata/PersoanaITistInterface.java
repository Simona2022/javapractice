package Interfata;

public class PersoanaITistInterface extends PersoanaInterface implements ITist{

    public PersoanaITistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scriecod() {
        System.out.println("IT-istul scrie cod");

    }

    @Override
    public void ruleazateste() {
        System.out.println("IT-istul reuleaza");

    }
}
