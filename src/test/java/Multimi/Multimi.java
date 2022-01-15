package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    @Test

    public void testautomat(){
        multiminumereArray();
        multimiprenumeArray();
        multimiprenumelist();
        multimevaloriHashMap();
        multimitariorase();

    }
    public void multiminumereArray(){
        Integer [] numere=new Integer[3];
        numere[0]=5;
        numere[1]=6;
        numere[2]=7;
        for(Integer index=0; index<numere.length; index++){
            System.out.println(numere[index]);
        }

    }

    public void multimiprenumeArray(){
        String [] prenume= new String[4];
        prenume[0]="Simona";
        prenume[1]="Gabriela";
        prenume[2]="Andrei";
        prenume[3]="Alex";
        for (Integer index=0; index<prenume.length; index++){
            System.out.println(prenume[index]);
        }
    }

    public void multimiprenumelist(){
        List<String> prenume=new ArrayList<>();
        prenume.add("Simona");
        prenume.add("Gabriela");
        prenume.add("Andrei");
        prenume.add("Alex");
        for (Integer index=0; index<prenume.size(); index++){
            System.out.println(prenume.get(index));
        }
    }
    public void multimevaloriHashMap(){
        //HashMap functioneaza dupa logica de key=value;
        HashMap<String,String> obiectediferite=new HashMap<>();
        obiectediferite.put("fruct","para");
        obiectediferite.put("leguma","morcov");
        obiectediferite.put("haina","bluza");
        for (String key: obiectediferite.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+obiectediferite.get(key));
        }
        Object firstKey=obiectediferite.keySet().toArray()[0];
        Object valueforFirstKey=obiectediferite.get(firstKey);
        System.out.println("Prime cheie este"+firstKey.toString());
        System.out.println("Prima valoare este "+valueforFirstKey.toString());
    }

    public void multimitariorase(){
        List<String> oraseRomania= new ArrayList<>();
        oraseRomania.add("Constanta");
        oraseRomania.add("Cluj");
        oraseRomania.add("Bucuresti");
        List<String> oraseItalia= new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Venetia");
        oraseItalia.add("Bari");
        oraseItalia.add("Polignano");
        HashMap<String,List<String>> tariorase=new HashMap<>();
        tariorase.put("Romania",oraseRomania);
        tariorase.put("Italia", oraseItalia);
        for (String key: tariorase.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt "+tariorase.get(key));
        }
    }

}
