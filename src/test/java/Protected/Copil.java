package Protected;

public class Copil {
    //public-vizibil peste tot in proiect
    //private-vizibil doar in clasa unde l-ai declarat
    //protected-vizibil in clasa parinte+clasa copil
    //defaul-vizibil in clasa parinte
    //protected vizibil in clasa parinte+copil indiferent daca se afla sau nu in acelasi pachet
    //default-vizibil daca declaram un obiect este vizibil in orice clasa din pachet
    // Default = daca declaram un obiect, este vizibil in orice clasa din pachet.
    // Protected = daca declaram un obiect, este vizibil in orice clasa din pachet.
    public void metodaPublica(){
        System.out.println("public");
    }
    private void metodaPrivate() {
        System.out.println("private");
    }
    protected void metodaProtected(){
        System.out.println("Protected");
    }
    void metodaDefault(){
        System.out.println("default");
    }
}
