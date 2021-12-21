package controller;
import model.*;
import java.util.ArrayList;

public class BuchungController {
    
    MainController mc;
    ArrayList<Buchung> buchung = new ArrayList<Buchung>();
    public BuchungController(MainController mc){
        setMc(mc);
        setBuchung(buchung);
    }
    

    public void createBuchungData(){
        Buchung b1 = new Buchung(getMc().getGc().getGruppe().get(0), getMc().getVc().getVolleyballplatz().get(0), 120);
        Buchung b2 = new Buchung(getMc().getGc().getGruppe().get(1), getMc().getVc().getVolleyballplatz().get(1), 60);
        buchung.add(b1);
        buchung.add(b2);
    }

    //Setter & Getter
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    public void setBuchung(ArrayList<Buchung> buchung) {
        this.buchung = buchung;
    }
    public ArrayList<Buchung> getBuchung() {
        return buchung;
    }
}
