package com.example.recyclerbinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerbinding.databinding.TaskItemListBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter<BookItemViewHolder> {

    private Context context;
    private List<Book> books = new ArrayList<>();

    public AdapterRecycler(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public BookItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        TaskItemListBinding binding = TaskItemListBinding.inflate(inflater, parent, false);
        return new BookItemViewHolder(binding.getRoot());

    }

    @Override
    public void onBindViewHolder(@NonNull BookItemViewHolder holder, int position) {
        Book dataModel = books.get(position);
        holder.bind(dataModel);

    }


    @Override
    public int getItemCount() {
        return books.size();
    }

    public void onChange(List<Book> books) {
        this.books.clear();
        this.books.addAll(books);
        notifyDataSetChanged();

    }

}
