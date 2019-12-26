package com.example.daltdd.Activity.network;

import com.example.daltdd.Activity.model.ListMoviePopular;
import com.example.daltdd.Activity.model.ListVideoInfo;


import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface HomeApiService {

    @GET("movie/popular?api_key=42519f135f15628eb628270a2ca1448f&language=vi-VN")
    Call<ListMoviePopular> getMoviePopular(

    );
    @GET("movie/{movie_id}/recommendations?api_key=42519f135f15628eb628270a2ca1448f&language=vi-VN&page=1")
    Call<ListMoviePopular> getMovieRecommendById(
        @Path("movie_id") int id
    );

    @GET("movie/{movie_id}/videos?api_key=42519f135f15628eb628270a2ca1448f&language=en-US")
    Call<ListVideoInfo> getIdYoutubeByIdMovie(
        @Path("movie_id")int id
    );

    @GET("search/movie?api_key=42519f135f15628eb628270a2ca1448f&language=vi-VN")
    Call<ListMoviePopular> searchMovieByName(
            @Query("query") String query,
            @Query("page") int page
    );

}
