package ru.netology.poster;

public class PosterManager {

    private Film[] films = new Film[0];
    private int countFilm = 10;

    public PosterManager() {
    }

    public PosterManager(int countFilm) {
        if (countFilm >= 0) {
            this.countFilm = countFilm;
        }
    }

    public void addNewFilm(Film movie) {
        Film[] tmp = new Film[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {

        int resultLength = Math.min(countFilm, films.length);
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - i - 1];
        }
        return result;
    }
}

