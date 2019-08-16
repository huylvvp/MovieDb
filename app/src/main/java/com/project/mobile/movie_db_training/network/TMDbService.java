package com.project.mobile.movie_db_training.network;

import com.project.mobile.movie_db_training.data.model.GenresResponse;
import com.project.mobile.movie_db_training.data.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TMDbService {
    @GET("genre/movie/list?language=en-US")
    Call<GenresResponse> getGenreList(@Query("api_key") String key);

    @GET("movie/{listType}?language=en-US")
    Call<MovieResponse> getMovieList(@Path("listType") String listType,
                                     @Query("api_key") String key,
                                     @Query("page") int page);
}