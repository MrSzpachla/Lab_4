import classes.Pracownik;
import classes.Student;
import enums.Wydzial;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI,
        b) zadeklarować 2 metody,

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
        d) zadeklarować 3 metody,

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,
         */


        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        Student s1 = new Student();
        Student s2 = new Student();
        s1.setImie("Kamil");
        s1.setNazwisko("Misiel");
        s1.setSemestr(3);
        s1.setIndeks("49567");
        s1.setNazwaWydzialu(Wydzial.Zarzadzanie);
        s2.setImie("Halina");
        s2.setNazwisko("Dubiel");
        s2.setSemestr(1);
        s2.setIndeks("84567");
        s2.setNazwaWydzialu(Wydzial.Rachunkowosc);

        Pracownik p1 = new Pracownik();
        Pracownik p2 = new Pracownik();
        p1.setImie("Andrzej");
        p1.setNazwisko("Kozdiej");
        p1.setEtat(1.0);
        p1.setNazwaWydzialup(Wydzial.Zarzadzanie);
        p1.setPrzedmiot("Przedmiot 1");
        p2.setImie("Joanna");
        p2.setNazwisko("Duda");
        p2.setEtat(0.75);
        p2.setNazwaWydzialup(Wydzial.Rachunkowosc);
        p2.setPrzedmiot("Przedmiot 2");

        System.out.println(s1+"\n");
        System.out.println(s2+"\n");
        System.out.println(p1+"\n");
        System.out.println(p2+"\n");

    }
}
