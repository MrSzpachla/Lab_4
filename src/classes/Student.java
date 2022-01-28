package classes;

import enums.Wydzial;
import interfaces.StudentI;

public class Student implements StudentI {

    private String Imie;
    private String Nazwisko;
    private Wydzial NazwaWydzialu;
    private String indeks;
    private int semestr;

    @Override
    public String getImie(String Imie) {
        return null;
    }

    @Override
    public String getNazwisko(String Nazwisko) {
        return null;
    }

    @Override
    public void getWydzial(Wydzial NazwaWydzialu) {

    }

    @Override
    public String getindeks(String indeks) {
        return null;
    }

    @Override
    public int getsemestr(int semsestr) {
        return 0;
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

    public Wydzial getNazwaWydzialu() {
        return NazwaWydzialu;
    }

    public void setNazwaWydzialu(Wydzial nazwaWydzialu) {
        NazwaWydzialu = nazwaWydzialu;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", NazwaWydzialu=" + NazwaWydzialu +
                ", indeks='" + indeks + '\'' +
                ", semestr=" + semestr +
                '}';
    }
}
