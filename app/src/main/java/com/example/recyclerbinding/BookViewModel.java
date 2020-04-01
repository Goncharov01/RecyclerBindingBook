package com.example.recyclerbinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class BookViewModel extends ViewModel {

    private MutableLiveData<List<Book>> books;

    public LiveData<List<Book>> getBooks(){
        if (books == null){
            books = new MutableLiveData<List<Book>>();
            getBookApi();
        }
        return  books;
    }

    public void getBookApi(){

        RetrofitClient.getApi().getBooks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(list -> books.setValue(list));
    }

    public void addBookButtonClicked(View v){
        System.out.println("!!!!!!!!!!");
        Context context = v.getContext();
        Intent intent = new Intent(context,SecondActivity.class);
        context.startActivity(intent);
    }

}
