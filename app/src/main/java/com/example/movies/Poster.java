package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Poster implements Serializable {

    @SerializedName("url")
    private String posterUrl;

    public Poster(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "posterUrl='" + posterUrl + '\'' +
                '}';
    }
}
