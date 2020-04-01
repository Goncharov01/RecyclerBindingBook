package com.example.recyclerbinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    Disposable disposable = null;

//    private BookApi taskApiService() {
//        return RetrofitClient.getApi();
//    }

    public List<Book> books = new ArrayList<>();

    AdapterRecycler adapterRecycler;

    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Cat cat = new Cat();
        cat.id = 1;
        Cat.setName("qwerty");
        System.out.println(cat.id  + " " + cat.getName());

        Cat catt = new Cat();
        catt.id = 2;
        catt.setName("QQQ");
        System.out.println(catt.id + " " + catt.getName());
        System.out.println(cat.id  + " " + cat.getName());


        BookViewModel bookViewModel = ViewModelProviders.of(this).get(BookViewModel.class);

        adapterRecycler = new AdapterRecycler(this, books);

        binding.setMyyAdapter(adapterRecycler);
        binding.setButtonAdapter(bookViewModel);


        bookViewModel.getBooks().observe(this, new Observer<List<Book>>() {
            @Override
            public void onChanged(List<Book> books) {
                adapterRecycler.onChange(books);
            }
        });


    }


//        recyclerView = findViewById(R.id.list);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        adapterRecycler = new AdapterRecycler(this, books);
//        recyclerView.setAdapter(adapterRecycler);


}
