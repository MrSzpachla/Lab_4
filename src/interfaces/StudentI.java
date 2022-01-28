package interfaces;

import enums.Wydzial;

public interface StudentI extends CzlowiekI {
    void getWydzial(Wydzial NazwaWydzialu);
    String getindeks(String indeks);
    int getsemestr(int semsestr);
}
