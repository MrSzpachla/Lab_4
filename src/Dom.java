public class Dom implements Budynek {

    /* a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
            (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
            */
    private double powierzchniacal;
    private int liczbaokien;
    private int liczbamieszkancow;
    private KolorEnum kolor;
    private double powB;
    private double powP;
    private double powPa;
    private String miejscowosc;
    private String ulica;
    private int nrDomu;
    private String nrLokalu;
    private String kodPocztowy;
    private int value;
    private boolean piwnica;
    public double c;


    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        this.powB = powBudynku;
        this.powP = powPodworka;
        this.powPa = powParkingu;
        return 0;
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrLokalu = nrLokalu;
        this.kodPocztowy = kodPocztowy;
        return null;
    }

    @Override
    public void liczbaOkien(int value) {
        this.liczbaokien = value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbamieszkancow = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }

    @Override
    public double wyliczCene(double powierzchnia, double cena) {
        c = cena * powierzchnia;
        return c;
    }

    @Override
    public void pietra(int value, boolean piwnica) {
        this.value = value;
        this.piwnica = piwnica;
    }

    public int getLiczbaokien() {
        return liczbaokien;
    }

    public int getLiczbamieszkancow() {
        return liczbamieszkancow;
    }

    public KolorEnum getKolor() {
        return kolor;
    }


    public void setLiczbaokien(int liczbaokien) {
        this.liczbaokien = liczbaokien;
    }

    public void setLiczbamieszkancow(int liczbamieszkancow) {
        this.liczbamieszkancow = liczbamieszkancow;
    }

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }

    public double getPowB() {
        return powB;
    }

    public double getPowP() {
        return powP;
    }

    public double getPowPa() {
        return powPa;
    }

    public double getPowierzchniacal() {
        return powierzchniacal;
    }

    public double powierzchniacalkowita(double p1, double p2, double p3)
    {
        powierzchniacal = p1 + p2 + p3;
        return powierzchniacal;
    }

    @Override
    public String toString() {
        return "Dom:" +
                "\nMiejscowosc: " + miejscowosc +
                "\nKod Pocztowy: " + kodPocztowy +
                "\nUlica: " + ulica +
                "\nNrDomu: " + nrDomu +
                "\nNrLokalu: " + nrLokalu +
                "\nNrDomu: " + nrDomu +
                "\nLiczba pieter: " + value +
                "\nPiwnica: " + piwnica +
                "\nliczba Okien: " + getLiczbaokien() +
                "\nLiczba Mieszkancow: " + liczbamieszkancow +
                "\nKolor: " + kolor +
                "\nPowierzchnia Budynku: " + powB +
                " m2 Podworka: " + powP +
                " m2 Parkingu: " + powPa +
                " m2\nPowierzchnia cal.: " + powierzchniacal +
                " m2\nCena: " + c +
                " zl\n\n";
    }
}
