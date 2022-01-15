package MostenireIncapsulare;

import javax.crypto.spec.PSource;
import java.util.List;

public class Audi extends Masina {
    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;

    public Audi(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotari = dotari;
        this.pret = pret;
        this.model = model;
    }

    public void infoMasina() {
        System.out.println("Detaliile despre masina Audi model " + model + " sunt urmatoarele");
        System.out.println(toString());

    }

    public void pretFinal() {
        Integer pretfinal = pret;
        Integer index = 0;
        while (index<dotari.size()) {
            if (dotari.get(index).equals("interior piele")) {
                pretfinal = pretfinal + 2000;
            }
            if (dotari.get(index).equals("incalzire scaune")) {
                pretfinal = pretfinal + 5000;
            }
            if (dotari.get(index).equals("ventilatie")) {
                pretfinal = pretfinal + 7000;
            }
            if (dotari.get(index).equals("trapa")) {
                pretfinal = pretfinal + 9000;
            }
            index++;
        }

        System.out.println("Pretul final al masinii model " + model + " este" + pretfinal);
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", tipCaroserie='" + getTipCaroserie()+ '\'' +
                ", transmisie='" + getTransmisie()+ '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';
    }
}
