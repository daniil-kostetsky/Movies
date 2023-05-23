package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    String TOKEN = "&token=TT401H6-VPJ4S7X-Q4HDZ7R-N31GZ9M";

    @GET("v1/movie?" +
            "selectFields=name" +
            "&selectFields=description" +
            "&selectFields=rating.kp" +
            "&selectFields=poster.url" +
            "&selectFields=year" +
            "&selectFields=movieLength" +
            "&selectFields=ageRating" +
            "&selectFields=id" +
            "&sortField=votes.kp" +
            "&sortField=rating.kp" +
            "&sortField=votes.imdb" +
            "&sortField=rating.imdb" +
            "&limit=50" +
            "&type=movie" +
            TOKEN)
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?field=id" + TOKEN)
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("v1/review?page=1&limit=20" + TOKEN)
    Single<ReviewsResponse> loadReviews(@Query("movieId") int id);
}
