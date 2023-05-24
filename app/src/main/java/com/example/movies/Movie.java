package com.example.movies;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


@Entity(tableName = "favourite_movies")
public class Movie implements Serializable {

    @PrimaryKey
    @SerializedName("id")
    private final int id;
    @SerializedName("name")
    private final String name;
    @SerializedName("description")
    private final String description;
    @SerializedName("year")
    private final int year;
    @SerializedName("movieLength")
    private final int movieLength;
    @SerializedName("ageRating")
    private final int ageRating;
    @Embedded
    @SerializedName("poster")
    private final Poster poster;
    @Embedded
    @SerializedName("rating")
    private final Rating rating;


    public Movie(int id, String name, String description, int year, int movieLength, int ageRating, Poster poster, Rating rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.movieLength = movieLength;
        this.ageRating = ageRating;
        this.poster = poster;
        this.rating = rating;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public Poster getPoster() {
        return poster;
    }

    public Rating getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", poster=" + poster +
                ", rating=" + rating +
                '}';
    }
}
