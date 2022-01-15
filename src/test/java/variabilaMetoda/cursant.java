package variabilaMetoda;

import org.junit.Test;

public class cursant {

    //am facut un comentariu
    //clasa=un sablon de variabile si metode
    //variabila=atributul unei clase
    //metoda=actiunea unei clase
    //tot timpul o clasa va avea langa nume cuvanul class
    //o clasa trebuie sa aiba un nume
    //o clasa trebuie sa fie publica pt moment=> oricine poate sa vada clasa
    //variabila=2 tipuri: globala sau locala
    //variabila globala-vizibila peste tot in clasa noastra
    //variabila globala structura= contine public tipVariabila, numeVariabila
    //variabila locala este vizibila doar in locul unde am scris-o
    //variabila locala structura= tipVariabila, numeVariabila
    //o variabila poate sau nu sa primeasca o valoare
    //ca sa dam o valoare la o varaibila se face cu egal
    //metodele sunt de 2 feluri: void si return
    // metoda void structura= public void numeMetoda() {}
    // metoda return structura= public tip variabila numeMetoda(){} (adaug un get la nume in fata)


    public String nume;
    public String prenume;
    public String adresa;
    public Integer adresanr;
    public Integer varsta;
    public Double kg;
    public Double experienta;


    @Test
    public void testautomat(){
    inscrierecurs();
    pltestetaxa();
    calculeazasuma();
    System.out.println(getsalariu());
    System.out.println(getadesa());
    }


    public void inscrierecurs(){
          nume="Andrei";
          prenume="Simona";
          adresa="strada Dunarii";
          adresanr=10;
          varsta=26;
          kg=57.6;
          experienta=1.4;

        //afisam o valoare in consola
        //print=printeaza si ramana cu cursorul pe linia curenta
        //println=printeaza dupa trece cu cursorul la linia urmatoare
        System.out.print(nume+" ");
        System.out.println(prenume);
        System.out.println(adresa+" "+adresanr);
        System.out.println(varsta);
        System.out.println(kg);
        System.out.print(experienta);
    };

    public void pltestetaxa (){
        nume="Andrei";
        prenume="Simona";
                //declaram si initializam o variabila locala
        Double taxa=2.500;
        System.out.println ("Cursantul cu numele "+ nume+" si prenumele "+prenume+" a platit taxa de "+ taxa );

    }
    public void calculeazasuma(){
        //declaram 3 variabile care adunate sa fie 100
        Integer suma=0;
        Integer valoarea1=30;
        Integer valoarea2=30;
        Integer valoarea3=40;
        suma=valoarea1+valoarea2+valoarea3;
        System.out.println("suma celor 3 variabile este "+suma);


    }
    public Double getsalariu(){
        Double salalriu=1.2355;
        return salalriu;
    }
    public String getadesa(){
        String adresa="strada Dunarii,nr.1";
        return adresa;
    }
}
