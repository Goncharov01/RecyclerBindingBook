package com.example.recyclerbinding;


import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerbinding.databinding.TaskItemListBinding;

public class BookItemViewHolder  extends RecyclerView.ViewHolder {


    TaskItemListBinding binding;

    public BookItemViewHolder(View v) {
        super(v);
        binding = DataBindingUtil.bind(v);
        }

    public void bind(Object obj) {
        binding.setVariable(BR.model, obj);
        binding.executePendingBindings();
    }

    }
