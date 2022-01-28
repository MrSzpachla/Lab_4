public interface Budynek {
    double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
    void liczbaOkien(int value); // użycie jak setter
    void liczbaMieszkancow(int value); // użycie jak setter
    void kolorDomu(KolorEnum kolor); // użycie jak setter
    double wyliczCene(double powierzchnia, double cena);
    enum KolorEnum{Czerwony, Zielony, Niebieski};
    void pietra(int value, boolean piwnica);
}
