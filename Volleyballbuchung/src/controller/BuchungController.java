package controller;
import model.*;
import view.Output;
import java.util.ArrayList;
import controller.*;

public class BuchungController {
    ArrayList<Buchung> buchung = new ArrayList<Buchung>();
    MainController _mc;
    public BuchungController(MainController mc){
        setMc(mc);
    }
    /*
    public void checkBuchung(){
        for(Buchung buchung : buchung){

        }
    }
    */
    public void demoData(){
        Buchung b1 = new Buchung(gruppe.get(0), volleyballplatz.get(0), 120);
        Buchung b2 = new Buchung(gruppe.get(1), volleyballplatz.get(1), 60);
        buchung.add(b1);
        buchung.add(b2);
    }

    public void setMc(MainController mc) {
        this._mc = mc;
    }
    public MainController getMc() {
        return _mc;
    }
}
