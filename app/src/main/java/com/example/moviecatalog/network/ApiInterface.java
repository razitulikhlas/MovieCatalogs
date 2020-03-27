package com.example.moviecatalog.network;

import com.example.moviecatalog.model.Movie;
import com.example.moviecatalog.util.Constant;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET(Constant.MOVIE_PATH + "/popular")
    Call<Movie> popularMovies(
            @Query("page") int page);

    @GET(Constant.MOVIE_PATH +"/{movie_id}/similar")
    Call<Movie> similarMovies(
            @Query("page") int page);

}
