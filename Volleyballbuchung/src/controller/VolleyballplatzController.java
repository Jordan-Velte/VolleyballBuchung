package controller;
import model.*;
import java.util.ArrayList;

public class VolleyballplatzController {
    ArrayList<Volleyballplatz> volleyballplatz = new ArrayList<Volleyballplatz>();
    MainController _mc;
    
    public VolleyballplatzController(MainController mc){
        setMc(mc);
        //Muss man den zweiten Setter?
        setVolleyballplatz(volleyballplatz);
    }

    public void createVolleyballplatz(){
        Volleyballplatz v1 = new Volleyballplatz(321, "gut", 6);
        Volleyballplatz v2 = new Volleyballplatz(12, "schlecht", 2);
        volleyballplatz.add(v1);
        volleyballplatz.add(v2);
    }
    public void printGruppe(){
        for(Volleyballplatz v : getVolleyballplatz()){
            getMc().getO().printData("Volleyballplatz Nummer: " + v.getNummer() + ", Zustand: " + v.getZustand());
        }
    }
    public void setMc(MainController mc) {
        this._mc = mc;
    }
    public MainController getMc() {
        return _mc;
    }
    public void setVolleyballplatz(ArrayList<Volleyballplatz> volleyballplatz) {
        this.volleyballplatz = volleyballplatz;
    }
    public ArrayList<Volleyballplatz> getVolleyballplatz() {
        return volleyballplatz;
    }
}
