package Laba_8;

/**
 * Класс библиотеки фильмов
 */
public class Library {
    private String[] films;
    private final String name;

    {
        this.films = new String[4];
        films[0] = "Hobbit";
        films[1] = "Matrix";
//        films[2] = "The Lord Of The Ring";
//        films[3] = "The Lord Of The Ring";
        System.out.println("Добавлены любимые фильмы");
    }

    {
        this.name = "Favorite Films";
        System.out.println("Библиотека " + name + " успешно создана");
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public int getpoint() {
        int i = 0;
        for (String film : this.getFilms()) {
            if (film == null) {
                return i;

            }
            i++;

        }
        System.out.println("Вы достигли максимума");
        return -1;
    }
}


