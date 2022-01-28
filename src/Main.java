public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */


        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */

        Dom budynek1 = new Dom();
        Budynek budynek2 = new Dom();
        budynek1.adresBudynku("Gdansk","Rzemieslnicza",13,"1","83-00");
        budynek1.powierzchnia(60,70,10);
        budynek1.pietra(2,true);
        budynek1.setKolor(Budynek.KolorEnum.Czerwony);
        budynek1.setLiczbamieszkancow(4);
        budynek1.setLiczbaokien(6);
        budynek1.powierzchniacalkowita(budynek1.getPowB(),budynek1.getPowP(),budynek1.getPowPa());
        budynek1.wyliczCene(budynek1.getPowierzchniacal(),7559);

        budynek2.adresBudynku("Braniewo","Bema",18,"3","14-500");
        budynek2.powierzchnia(30,40,5);
        budynek2.pietra(1,false);
        ((Dom) budynek2).setKolor(Budynek.KolorEnum.Zielony);
        ((Dom) budynek2).setLiczbamieszkancow(2);
        ((Dom) budynek2).setLiczbaokien(4);
        ((Dom) budynek2).powierzchniacalkowita(((Dom) budynek2).getPowB(), ((Dom) budynek2).getPowP(), ((Dom) budynek2).getPowPa());
        budynek2.wyliczCene(((Dom) budynek2).getPowierzchniacal(),3598);

        System.out.println(budynek1);
        System.out.println(budynek2);

    }
}
