package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Cursant {


   //Obiect=instanta unei clase
    // Recunoastem un obiect dupa cuvantul cheie new
    //Putem face n obiecte dintr-o clasa
    //Structura unui obiect - numeClasa, numeObiect=new nume clasa(se va apela constructorul clasei)(dam valori pentru variabile)
    //exemplu obiect: Cursant Simona= new Cursant()
    //Constructor=are ca rol sa initializeze variabilele unei clase;
    //Intr-o clasa putem avea n constructori
    //Exista 2 tipuri de constructori: cu parametri si fara parametri
    //Diferentierea intre constructori se face prin tipul parametrilor sau numarul
    //Daca nu fac eu un constructor=>exista unu by default fara parametri
    //Structura constructor: public nume clasa()

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character gen;
    public Boolean diplomaBac;
    public List<String> cursuriinteres;
    public String cursinteres;

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomaBac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursuriinteres = cursuriinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomaBac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursuriinteres = cursuriinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomaBac, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursinteres = cursinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomaBac, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursinteres = cursinteres;
    }

    public void dateCursant(){
        System.out.println("Datele despre cursant sunt umatoarele: ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if(taxa!=null){
            System.out.println(taxa);
        }
        System.out.println(gen);
        System.out.println(diplomaBac);
        System.out.println("Cursurile de interes sunt urmatoarele:");
        if (cursuriinteres!=null) {
            for (Integer index = 0; index < cursuriinteres.size(); index++) {
                System.out.println(cursuriinteres.get(index));
            }
        }
        else {
            System.out.println(cursinteres);
        }
    }
    public void verificadiplomabac(){
        if(diplomaBac){
            System.out.println("cursantul"+nume+" "+prenume+"are diploma de BAC");
        }
        else {
            System.out.println("Cursantul"+nume+" "+prenume+"nu are diploma de bac");
        }
    }
}
