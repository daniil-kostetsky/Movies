package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Locale;

public class Rating implements Serializable {

    @SerializedName("kp")
    private final String kpRating;

    public Rating(String kpRating) {
        this.kpRating = kpRating;
    }

    public String getKpRating() {
        double kp = Double.parseDouble(kpRating);
        return String.format(Locale.ENGLISH,"%.1f", kp);
    }


    @Override
    public String toString() {
        return "Rating{" +
                "kpRating='" + kpRating + '\'' +
                '}';
    }
}
