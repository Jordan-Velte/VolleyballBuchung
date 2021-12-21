package model;

public class Gruppe {
    int _anzahl;
    String _GLVorname;
    String _GLNachname;

    public Gruppe(int anzahl, String GLVorname, String GLNachname){
        setAnzahl(anzahl);
        setGLNachname(GLNachname);
        setGLVorname(GLVorname);
    }

    public void setGLNachname(String GLNachname) {
        this._GLNachname = GLNachname;
    }
    public void setGLVorname(String GLVorname) {
        this._GLVorname = GLVorname;
    }
    public void setAnzahl(int anzahl) {
        this._anzahl = anzahl;
    }
    public String getGLNachname() {
        return _GLNachname;
    }
    public String getGLVorname() {
        return _GLVorname;
    }
    public int getanzahl() {
        return _anzahl;
    }
}
