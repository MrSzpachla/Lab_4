public class Dom implements Budynek {

   /* a) napisać klasę Dom implementującą interfejs Budynek,
    b) zaimplementować wszystkie metody,
    c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
    d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */
    /*private double powieBudynku;
    private double powPodworka;
    private double powParkingu;
    private String miejscowosc;
    private String ulica;
    private int nrDomu;
    private String nrLokalu;
    private String kodPocztowy;
    private double powierzchnia;
    private double cena;*/
    private int liczbaokien;
    private int liczbamieszkancow;
    private KolorEnum kolor;


    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        return powierzchnia( powBudynku, powPodworka,powParkingu);
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) {
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
        return 0;
    }

    @Override
    public void pietra(int value, boolean piwnica) {

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

    @Override
    public String toString() {
        return "Dom{" +
                "liczbaokien=" + liczbaokien +
                ", liczbamieszkancow=" + liczbamieszkancow +
                ", kolor=" + kolor +
                '}';
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


    public double powierzchniacalkowita()
    {
        double suma = powierzchnia(double po);
        return suma;
    }
}
