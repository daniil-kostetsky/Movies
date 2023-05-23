package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Trailer {

    @SerializedName("url")
    private String trailerUrl;
    @SerializedName("name")
    private String trailerName;

    public Trailer(String trailerUrl, String trailerName) {
        this.trailerUrl = trailerUrl;
        this.trailerName = trailerName;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public String getTrailerName() {
        return trailerName;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "trailerUrl='" + trailerUrl + '\'' +
                ", trailerName='" + trailerName + '\'' +
                '}';
    }
}
