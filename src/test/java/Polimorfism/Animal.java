package Polimorfism;

public class Animal {
    //polimorfism=conceptul prin care o metoda poate avea implementari diferite
    //2 feluri: dinamic (override), static(overloud)
    //polimorfismu dinamic: intr-o ierarhie de clase obtintute prin mostenire o metoda poate avea implementari diferite
    //static-conceputl pe baza caruia o metoda are o structura diferita

    public String rasa;
    public String talie;
    public String blana;

    public Animal(String rasa, String talie, String blana) {
        this.rasa = rasa;
        this.talie = talie;
        this.blana = blana;
    }
    //polimorfism dinamic
    public void scoatesunet(){
        System.out.println("Animalul scoate sunet");

    }
    public Integer getpret(){
        return 230;
    }
}
