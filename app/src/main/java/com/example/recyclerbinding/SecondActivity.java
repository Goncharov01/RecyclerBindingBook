package com.example.recyclerbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.recyclerbinding.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        BookAddViewModel bookAddViewModel = ViewModelProviders.of(this).get(BookAddViewModel.class);
//        BookAddViewModel bookAddViewModel = new BookAddViewModel();

        binding.setAddBook(bookAddViewModel);
//        adapterToString = new AdapterToString(this);




    }
}
