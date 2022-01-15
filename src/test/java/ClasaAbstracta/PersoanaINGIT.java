package ClasaAbstracta;

public class PersoanaINGIT extends PersoanaAbstract{
    public String prenume;
    public String nume;

    public PersoanaINGIT(String prenume, String nume) {
        this.prenume = prenume;
        this.nume = nume;
    }

    @Override
    public void prioecteaza() {
        System.out.println(" Persoana proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println(" Persoana executa");

    }

    @Override
    public void scriecod() {
        System.out.println("Persoana scrie cod");

    }

    @Override
    public void ruleazacod() {
        System.out.println(" Persoana ruleaza cod");

    }
}
