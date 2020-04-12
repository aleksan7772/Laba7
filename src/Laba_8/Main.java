package Laba_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Оно", 2.0, Film.HORRORS("Ужасы"));
        System.out.println(film);
        Library library = new Library();
        System.out.println(library.getName());
        System.out.println(Arrays.toString(library.getFilms()));
        System.out.println(library.getpoint());
    }
}
