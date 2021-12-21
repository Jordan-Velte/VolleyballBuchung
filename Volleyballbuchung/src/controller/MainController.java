package controller;
import view.Output;

public class MainController{
    BuchungController bc;
    GruppeController gc;
    VolleyballplatzController vc;
    Output o = new Output();
    /*
    ArrayList<Gruppe> gruppe = new ArrayList<Gruppe>();
    ArrayList<Volleyballplatz> volleyballplatz = new ArrayList<Volleyballplatz>();
    */
    public MainController(){
        setBc(new BuchungController(this));
        setGc(new GruppeController(this));
        setVc(new VolleyballplatzController(this));
        createDemoData();
        printDemodata();


    }
    //Ruft MainController immer alle Methoden von anderen Controllern auf?
    public void createDemoData(){
        getGc().createGruppeData();
        getVc().createVolleyballplatz();
        //Muss als letztes erstellt werden, weil sonst index out of bounds (siehe Instanzverweise)!
        getBc().createBuchungData();
    }
    public void printDemodata(){
        getGc().printGruppe();
        getVc().printGruppe();
    }

    //Setter & Getter
    public void setBc(BuchungController bc) {
        this.bc = bc;
    }
    public void setGc(GruppeController gc) {
        this.gc = gc;
    }
    public void setO(Output o) {
        this.o = o;
    }
    public void setVc(VolleyballplatzController vc) {
        this.vc = vc;
    }
    public BuchungController getBc() {
        return bc;
    }
    public GruppeController getGc() {
        return gc;
    }
    public Output getO() {
        return o;
    }
    public VolleyballplatzController getVc() {
        return vc;
    }

}

//Kommentar von Nils: 
      /*
        Du hast einen MainController und in dem erstellst du dann den Output, den Buchungscontroller, den VolleyballplatzController und den Gruppencontroller.
        */

        /*
        Für Jordan:
        Er hat sich übrigens dazu entschieden die Unterstriche zu ändern(er meinte das magst du nicht)
        Neue Controller wie BC oder VC im Constructor des MainControllers erstellen.
        Dafür die Controller, um sie zwischenspeichern zu können, als Klassenvariablen speichern.
        BuchungsController b als Klassenvariable bc setten
        Jetzt wird es in den andreren Klassen so eingerichtet, dass man man den MainController im BuchungsController hat und andersherum
        Im Constructor muss man das this schreiben, da er sich selbst übergeben muss
        Dann erstellen wir Demodaten in den jeweiligen Controllern dafür 
        Mann muss die Sachen in ArrayLists speichern, da man dann später bei den Buchungen darauf zugreifen soll
        Achso keine Ahnung ob du das hast aber keine String für Volleyballplatz und so machen in der Buchungsklasse, wurde angeschrien dafür :(
        
        
        */