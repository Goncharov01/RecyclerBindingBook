package com.example.recyclerbinding;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BookApi {

    @GET("/api/books")
    Observable<ArrayList<Book>> getBooks();

    @POST("/api/books/create")
    Observable<Book> addBook(@Body Book book);

}
