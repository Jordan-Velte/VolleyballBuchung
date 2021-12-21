package controller;
import model.*;
import view.Output;
import java.util.ArrayList;
import controller.*;

public class MainController{
    ArrayList<Gruppe> gruppe = new ArrayList<Gruppe>();
    ArrayList<Volleyballplatz> volleyballplatz = new ArrayList<Volleyballplatz>();

    public MainController(){
        Output o = new Output();
        BuchungController bc = new BuchungController(this);
        GruppeController gc = new GruppeController(this);
        Volleyballplatz vpc = new Volleyballplatz(this);
    }
    
    public void demoData(){
        Gruppe g1 = new Gruppe(2, "Friedrich", "Ebert");
        Gruppe g2 = new Gruppe(4, "Zet", "Man");
        gruppe.add(g1);
        gruppe.add(g2);
        Volleyballplatz v1 = new Volleyballplatz(321, "gut", 6);
        Volleyballplatz v2 = new Volleyballplatz(12, "schlecht", 2);
        volleyballplatz.add(v1);
        volleyballplatz.add(v2);
        Buchung b1 = new Buchung(gruppe.get(0), volleyballplatz.get(0), 120);
        Buchung b2 = new Buchung(gruppe.get(1), volleyballplatz.get(1), 60);
        buchung.add(b1);
        buchung.add(b2);
    }
}
