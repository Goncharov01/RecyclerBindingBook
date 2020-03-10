package com.example.recyclerbinding;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface BookApi {

    @GET("/api/books")
    Observable<ArrayList<Book>> getBooks();

}
