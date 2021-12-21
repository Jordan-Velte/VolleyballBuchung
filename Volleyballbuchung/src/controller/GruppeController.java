package controller;
import model.*;
import java.util.ArrayList;

public class GruppeController {
    MainController mc;
    ArrayList<Gruppe> gruppe = new ArrayList<Gruppe>();
    
    public GruppeController(MainController mc){
        setMc(mc);
        setGruppe(gruppe);
    }
    public void createGruppeData(){
        Gruppe g1 = new Gruppe(2, "Friedrich", "Ebert");
        Gruppe g2 = new Gruppe(4, "Zet", "Man");
        gruppe.add(g1);
        gruppe.add(g2);
    }

    public void printGruppe(){
        for(Gruppe g : getGruppe()){
            getMc().getO().printData(g.getGLNachname() + " " + g.getGLVorname());
        }
    }
    //Setter & Getter
    public void setGruppe(ArrayList<Gruppe> gruppe) {
        this.gruppe = gruppe;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public ArrayList<Gruppe> getGruppe() {
        return gruppe;
    }
    public MainController getMc() {
        return mc;
    }
}
