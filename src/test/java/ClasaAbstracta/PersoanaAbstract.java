package ClasaAbstracta;

public abstract class PersoanaAbstract {
    //clasa abstracta=poate sau nu sa contina metode abstracte!
    //clasa care extinde o clasa abstracta=implementeaza toate metodele abstracte;
    //clasa abstracta poate sa contina un constructor=tot nu putem declara un obiect
    // metodele abstracte folosesc cuvantul abstract(abstract void )
    //o clasa abstracta poate implementa o interfata
    // o interfata nu poate extinde o clasa abstracta
    //metodele ar trebui sa fie publice

    public abstract void prioecteaza();
    public abstract void executie();
    public abstract void scriecod();
    public abstract void ruleazacod();
    public void afiseazavarsta(Integer varsta){
        System.out.println("Vasrta este "+varsta);
    }

}
