/**
 * nazwa klasy: Film
 * pola: - tytul - Przechowuje tytuł filmu, maksymalnie do 20 znaków
 *       - liczbaWypożyczeń - Przechowuje liczbę wypożyczeń filmu

 * metody: - setTytul(String tytul), void - Ustawia tytuł filmu. Tytuł może mieć maksymalnie 20 znaków
 *         - getTytul(), String - Pobiera tytuł filmu
 *         - getLiczbaWypozyczen(), int - Pobiera liczbę wypożyczeń filmu
 *         - inkrementacja(), void - Inkrementuje liczbę wypożyczeń filmu o 1.

 * informacje: Klasa Film przechowuje informacje o tytule filmu oraz liczbie jego wypożyczeń.
 *             Tytuł filmu może mieć maksymalnie 20 znaków. Klasa umożliwia ustawienie tytyłu,
 *             pbranie tytułu oraz liczby wypożyczeń, a także ikrementację liczby wypożyczeń.

 * autor: 00000000000
 * **/

public class Film {
    private String tytul;
    private int liczbaWypozyczen;

    public Film() {
        this.tytul = "";
        this.liczbaWypozyczen = 0;
    }

    public void setTytul(String tytul) {
        if (tytul != null && tytul.length() <=20){
            this.tytul = tytul;
        }
        else {
            System.out.print("Tytuł musi mieć maksymalnie 20 znaków");
        }
    }

    public String getTytul() {
        return tytul;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void inkrementacja(){
        this.liczbaWypozyczen++;
    }
}
