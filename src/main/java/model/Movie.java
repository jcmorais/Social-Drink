package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    private int id;
    public String title;
    public int year;
    public String img_path;
    public String overview;
    private List<String> genres;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImg_path() {
        return img_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", img_path='" + img_path + '\'' +
                ", overview='" + overview + '\'' +
                ", genres=" + genres +
                '}';
    }
}