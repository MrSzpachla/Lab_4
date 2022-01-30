import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        int x = 0;
        boolean isIndexCorrect = false;
        Scanner scan = new Scanner(System.in);
        String tab[] = {"Toyota", "Opel","KIA","Volvo","Mazda","Citroen"};
        while (!isIndexCorrect)
        {
            System.out.println("Podaj indeks tablicy [0-5]: ");
            try {
                x = Integer.parseInt(scan.next());
            } catch (NumberFormatException e) {
                System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
                throw e;
            }


                try {
                    System.out.println(tab[x]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Błąd Podałeś index: " + x + ", a dozwolone są od 0 do " + (tab.length - 1));
                } finally {
                    if (x < 6 && x >= 0) {
                    System.out.println("Koniec programu");
                    isIndexCorrect = true;}
                }


        }



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        // a)

        String text = null;
        try
        {
            if (text.equals("abc"))
                System.out.println("Zmienna zawiera 'abc'");
            else
                System.out.println("Zmienna ma inna wartosc");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Caught! Zmienna jest ,,pusta''");
        }


        // b)
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("\nNie dzielimy przez 0!!");
        }

    }
}
