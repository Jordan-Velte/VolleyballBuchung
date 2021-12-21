package controller;
import model.*;
import view.Output;
import java.util.ArrayList;
import controller.*;
public class VolleyballplatzController {
    ArrayList<Volleyballplatz> volleyballplatz = new ArrayList<Volleyballplatz>();
    MainController _mc;
    public VolleyballplatzController(MainController mc){
        setMc(mc);
    }
    public void setMc(MainController mc) {
        this._mc = mc;
    }
    public MainController getMc() {
        return _mc;
    }

    public void demoData(){
        Volleyballplatz v1 = new Volleyballplatz(321, "gut", 6);
        Volleyballplatz v2 = new Volleyballplatz(12, "schlecht", 2);
        volleyballplatz.add(v1);
        volleyballplatz.add(v2);
    }
}
