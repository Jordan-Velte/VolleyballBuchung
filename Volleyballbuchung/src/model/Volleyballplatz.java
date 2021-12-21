package model;

public class Volleyballplatz {
    int _nummer;
    String _zustand;
    int _maxPersonen;

    public Volleyballplatz(int nummer, String zustand, int maxPersonen){
        setMaxPersonen(maxPersonen);
        setNummer(nummer);
        setZustand(zustand);
    }

    public void setMaxPersonen(int maxPersonen) {
        this._maxPersonen = maxPersonen;
    }
    public void setNummer(int nummer) {
        this._nummer = nummer;
    }
    public void setZustand(String zustand) {
        this._zustand = zustand;
    }
    public int getMaxPersonen() {
        return _maxPersonen;
    }
    public int getNummer() {
        return _nummer;
    }
    public String getZustand() {
        return _zustand;
    }

}
