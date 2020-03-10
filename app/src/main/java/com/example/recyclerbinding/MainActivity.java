package com.example.recyclerbinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
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

    private BookApi taskApiService() {
        return RetrofitClient.getApi();
    }

    public List<Book> books = new ArrayList<>();

    AdapterRecycler adapterRecycler;

    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        adapterRecycler = new AdapterRecycler(this, books);
        binding.setMyyAdapter(adapterRecycler);

        disposable = taskApiService().getBooks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(list -> adapterRecycler.onChange(list));

    }


//        recyclerView = findViewById(R.id.list);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        adapterRecycler = new AdapterRecycler(this, books);
//        recyclerView.setAdapter(adapterRecycler);


}
