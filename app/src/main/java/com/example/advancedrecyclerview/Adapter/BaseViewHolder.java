package com.example.advancedrecyclerview.Adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedrecyclerview.model.TimelineItem;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {


    abstract void setData(TimelineItem item);
    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
