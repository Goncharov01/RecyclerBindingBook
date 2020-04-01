package com.example.recyclerbinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookAddViewModel extends ViewModel {

    public MutableLiveData<Integer> id = new MutableLiveData<>();

    public MutableLiveData<String> title = new MutableLiveData<>();

    public MutableLiveData<String> author = new MutableLiveData<>();

    public MutableLiveData<String> description = new MutableLiveData<>();

    public MutableLiveData<Integer> published = new MutableLiveData<>();

    public void setId(MutableLiveData<Integer> id) {
        this.id = id;
    }

    public void setPublished(String s) {
        this.published.setValue(Integer.valueOf(s));
    }

    public BookAddViewModel() {

    }

    MutableLiveData<Book> book;

    public MutableLiveData<Book> getBook() {
        if (book == null) {
            book = new MutableLiveData<>();
        }
        return book;
    }

    public void save() {
        Book book = new Book(id.getValue(), title.getValue(), author.getValue(), description.getValue(), published.getValue());
        System.out.println(book);

    }
//        RetrofitClient.getApi().addBook(new Book(id.getValue(),title.getValue(),author.getValue(),description.getValue(),published.getValue()))
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe();


    public void onClick(View v) {
        save();
        Context context = v.getContext();
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }





//    @BindingConversion
//    public static String intToStr(Integer value) {
//        return value != null ? String.valueOf(value) : "";
//    }
//
//    @InverseBindingAdapter(attribute = "android:text")
//    public static Integer captureIntValue(EditText view) {
//        long value = 0;
//        try {
//            value = Integer.parseInt(view.getText().toString());
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }
//        return value;
//    }


}
