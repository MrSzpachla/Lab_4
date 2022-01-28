package interfaces;

import enums.Wydzial;

public interface PracownikI extends CzlowiekI{
    void getWydzialp(Wydzial NazwaWydzialup);
    String getprzedmiot(String przedmiot);
    double getetat(double etat);
}
