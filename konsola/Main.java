public class Main {
    public static void main(String[] args) {
        Film film = new Film();

        System.out.println("Tytuł filmu: " + film.getTytul());
        System.out.println("Początkowa liczba wypożyczeń " + film.getLiczbaWypozyczen());

        film.setTytul("Harry Potter");
        System.out.println("Nowy tytuł: " + film.getTytul());

        System.out.println("Liczba wypożyczeń przed inkrementacją: " + film.getLiczbaWypozyczen());
        film.inkrementacja();
        System.out.println("Liczba wypożyczeń po inkrementacji: " + film.getLiczbaWypozyczen());
    }
}