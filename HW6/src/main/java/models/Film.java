package models;

import java.util.Objects;

public class Film {
    private int id;
    private String title;
    private String description;
    private double rate;
    private int length;

    public Film() {
    }

    public Film(int id, String title, String description, double rate, int length) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rate = rate;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id &&
                Double.compare(film.rate, rate) == 0 &&
                length == film.length &&
                Objects.equals(title, film.title) &&
                Objects.equals(description, film.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, rate, length);
    }
}
