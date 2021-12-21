package model;
public class Buchung {
    Gruppe _gruppe;
    Volleyballplatz _volleyballplatz;
    //Zeit in Minuten
    int _zeit;

    public Buchung(Gruppe gruppe, Volleyballplatz volleyballplatz, int zeit){
        setGruppe(gruppe);
        setVolleyballplatz(volleyballplatz);
        setZeit(zeit);
    }

    public void setGruppe(Gruppe gruppe) {
        this._gruppe = gruppe;
    }
    public void setVolleyballplatz(Volleyballplatz volleyballplatz) {
        this._volleyballplatz = volleyballplatz;
    }
    public void setZeit(int zeit) {
        this._zeit = zeit;
    }
    public Gruppe getGruppe() {
        return _gruppe;
    }
    public Volleyballplatz getVolleyballplatz() {
        return _volleyballplatz;
    }
    public int getZeit() {
        return _zeit;
    }

}
