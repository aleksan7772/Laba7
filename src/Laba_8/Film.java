package Laba_8;

/**
 * Создание конструктора и методов для описания фильма
 */
public class Film {
    private String name;
    private double duration; // продолжительность фильма
    private String genre; // жанр фильма

    public Film(String name, double duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + this.name + "  Успешно создан");
    }

    static {
        System.out.println("Создаётся новый фильм");
    }

    public static final String FANTASTIC(String fantastic) {
        return fantastic;
    }

    public static final String COMEDY(String comedy) {
        return comedy;
    }

    public static final String HORRORS(String horrors) {
        return horrors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
