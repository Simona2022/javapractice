package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    // 2 tiuri de structuri: alternative si repetitive
    //structura alternativa= if conditia e indeplinta then
    //                                                else
    //nu este neaparat nevoie de else
    //poti avea mai multe if-uri

    @Test
    public void testautomat(){
        verificanumere();
        verificanume("Alexandru", "Dan");
        verificanumerecomplex(7,5);
        verificanumerecomplex(3,3);
        verificanumerecomplex(2,3);
    }
    //verificam daca 5 este mai mare decat 3;
    public void verificanumere(){
        if (5<3) {
            System.out.println("5 este mai mare decat 3");
        }
    else {
        System.out.println("5 este mai mic ca 3");
        }
    }

    //verificam daca alexandru contine alex
    public void verificanume( String nume1, String nume2 ){

        if(nume1.contains(nume2)){
            System.out.println(nume1+ " contine " +nume2);
        }
        else {
            System.out.println( nume1+ " nu contine "+nume2);
        }
    }

    //verificam daca un numar este mai mare decat altul incluzand mai multe cazuri
    public void verificanumerecomplex(Integer nr1, Integer nr2){
        if (nr1>nr2){
            System.out.println( nr1 +"este mai mare decat"+nr2 );
        }
        if (nr1<nr2){
            System.out.println( nr1 +"este mai mic decat"+nr2);
        }
        if (nr1==nr2){
            System.out.println( nr1+ "este egal cu" +nr2);
        }
        if (nr1!=nr2){
            System.out.println(nr1+ "este diferit de"+ nr2);
        }
    }
}
//tema: