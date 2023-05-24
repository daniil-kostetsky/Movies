package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class TrailerResponse {

    @SerializedName("videos")
    private final TrailersList trailersList;

    @Override
    public String toString() {
        return "TrailerResponse{" +
                "trailersList=" + trailersList +
                '}';
    }

    public TrailersList getTrailersList() {
        return trailersList;
    }

    public TrailerResponse(TrailersList trailersList) {
        this.trailersList = trailersList;
    }
}
