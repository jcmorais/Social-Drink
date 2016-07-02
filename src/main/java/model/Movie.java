package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    public int runtime;
    public String language;


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

    public int getRuntime() {
        return runtime;
    }

    public String getLanguage() {
        return language;
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

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", img_path='" + img_path + '\'' +
                ", overview='" + overview + '\'' +
                ", runtime=" + runtime +
                ", language='" + language + '\'' +
                '}';
    }
}