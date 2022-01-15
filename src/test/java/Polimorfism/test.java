package Polimorfism;

import org.junit.Test;

public class test {
    @Test
    public void testautomat(){
        Caine labrador=new Caine("labrador","medie","deasa");
        labrador.scoatesunet();
        labrador.apeleazametodaparinte();
        labrador.cumpraraProduse();
        labrador.cumpraraProduse("lesa");
        labrador.cumpraraProduse(2);
    }
}
