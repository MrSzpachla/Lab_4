package classes;

import enums.Wydzial;
import interfaces.PracownikI;

public class Pracownik implements PracownikI {

    private Wydzial NazwaWydzialup;
    private String przedmiot;
    private double etat;
    private String Imie;
    private String Nazwisko;

    @Override
    public void getWydzialp(Wydzial NazwaWydzialup) {

    }

    @Override
    public String getprzedmiot(String przedmiot) {
        return null;
    }

    @Override
    public double getetat(double etat) {
        return 0;
    }

    @Override
    public String getImie(String Imie) {
        return null;
    }

    @Override
    public String getNazwisko(String Nazwisko) {
        return null;
    }

    public Wydzial getNazwaWydzialup() {
        return NazwaWydzialup;
    }

    public void setNazwaWydzialup(Wydzial nazwaWydzialup) {
        NazwaWydzialup = nazwaWydzialup;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public double getEtat() {
        return etat;
    }

    public void setEtat(double etat) {
        this.etat = etat;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "NazwaWydzialup=" + NazwaWydzialup +
                ", przedmiot='" + przedmiot + '\'' +
                ", etat=" + etat +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                '}';
    }
}
