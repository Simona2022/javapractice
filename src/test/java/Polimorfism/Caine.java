package Polimorfism;

public class Caine extends Animal {

    public Caine(String rasa, String talie, String blana) {
        super(rasa, talie, blana);
    }
//polimorfism dinamic
    @Override
    public void scoatesunet() {
        System.out.println("Cainele latra");

    }
    public void apeleazametodaparinte(){
        super.scoatesunet();
    }
    //polimorfism static
    public void cumpraraProduse(){
        System.out.println("Nu mi-a placut nimic");
    }

    public void cumpraraProduse(String produ1){
        System.out.println("Am cumparat un produs:"+produ1);
    }

    public void cumpraraProduse(Integer produ1){
        System.out.println("Am cumparat un produs:"+produ1);
    }
    //nu se poate cu return
    public Integer getCaine(){
        return 1;
    }
    public String getCaine(String nume1){
        return "1";
    }
    //metoda return putem aplica polimorfism dinamic
    //putem aplica polimorfismmu static doar la nivel de numar de parametri

    @Override
    public Integer getpret() {
        return super.getpret();
    }
}
