package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReviewsResponse {

    @SerializedName("docs")
    private List<Review> reviews;

    public List<Review> getReviews() {
        return reviews;
    }

    public ReviewsResponse(List<Review> review) {
        this.reviews = review;
    }

    @Override
    public String toString() {
        return "ReviewsResponse{" +
                "review=" + reviews +
                '}';
    }
}
