package ClasaAbstracta;

public class PersoanaInginerAbstract extends PersoanaAbstract{
    @Override
    public String nume;
    public String prenume;

    public PersoanaInginerAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void prioecteaza() {
        System.out.println("Inginer proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("Inginer executa");

    }

    @Override
    public void scriecod() {

    }

    @Override
    public void ruleazacod() {

    }
}
