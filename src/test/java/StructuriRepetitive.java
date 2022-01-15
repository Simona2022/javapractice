import org.junit.Test;

public class StructuriRepetitive {
    //cele mai intalnite structuri repetitive:for si while

    @Test
    public void testutomat (){
        printamnumerefor();
        printamnumerewhile();

    }

    //printam primele 200 de numere
    public void printamnumerefor(){
        for (Integer index=1;index<=200;index++){
            System.out.println( index);
        }
    }

    public void printamnumerewhile(){
        Integer index=1;
        while (index<=1){
            System.out.println( index);
            index++;
        }
    }
}