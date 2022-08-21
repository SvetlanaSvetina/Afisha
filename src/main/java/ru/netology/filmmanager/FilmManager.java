package ru.netology.filmmanager;
public class FilmManager {

    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAllFilms() {
        return films;
    }

    public String[] findLastFilms() {
        int resultSize = limit < films.length ? limit : films.length;
        String[] result = new String[resultSize];
        for (int i = 0; i < limit; i++){
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}

