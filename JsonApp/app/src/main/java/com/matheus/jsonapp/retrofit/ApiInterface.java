package com.matheus.jsonapp.retrofit;

import com.matheus.jsonapp.model.Comments;
import com.matheus.jsonapp.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/posts")
    Call<List<Posts>> getPosts();

    @GET("/comments")
    Call<List<Comments>> getComments();

    @GET("/albums")
    Call<List<Posts>> getAlbums();

    @GET("/photos")
    Call<List<Posts>> getPhotos();

    @GET("/todos")
    Call<List<Posts>> getTodos();
}
