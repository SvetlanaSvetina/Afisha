package ru.netology.filmmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmManagerTest {
    String film1 = "Фильм №1";
    String film2 = "Фильм №2";
    String film3 = "Фильм №3";
    String film4 = "Фильм №4";
    String film5 = "Фильм №5";
    String film6 = "Фильм №6";

    String film7 = "Фильм №7";

    String film8 = "Фильм №8";
    String film9 = "Фильм №9";

    String film10 = "Фильм №10";
    String film11 = "Фильм №11";


    FilmManager manager = new FilmManager();

    @Test
    public void findAllFilms() {  // найти и вывести все фильмы

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        String[] expected = {
                film1,
                film2,
                film3,
                film4,
                film5,
                film6,
                film7,
                film8,
                film9,
                film10
        };
        String[] actual = manager.findAllFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilms() {  //найти последний фильм
        FilmManager manager = new FilmManager(5);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {
                film5,
                film4,
                film3,
                film2,
                film1,
        };
        String[] actual = manager.findLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFilmMoreThanLimit() {
        FilmManager manager = new FilmManager(0); // если фильмов 11, то выводит 10
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        String[] expected = {
        };

        String[] actual = manager.findLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFilmsInLimit() {
        FilmManager manager = new FilmManager(2); // если фильмов 2, то выводит 2
        manager.add(film1);
        manager.add(film2);

        String[] expected = {
                film2,
                film1,

        };
        String[] actual = manager.findLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFilmslessThanLimit() {
        FilmManager manager = new FilmManager(0); // если фильмов 0, то выводит 0

        String[] expected = {
        };

        String[] actual = manager.findLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
}
