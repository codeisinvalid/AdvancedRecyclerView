package com.example.advancedrecyclerview.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.advancedrecyclerview.R;
import com.example.advancedrecyclerview.model.PostVideoItem;
import com.example.advancedrecyclerview.model.TimelineItem;

public class PostVideoViewHolder extends BaseViewHolder{

    private TextView tvTime;
    private ImageView imgUser;
    public PostVideoViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTime = itemView.findViewById(R.id.post_video_time);
        imgUser = itemView.findViewById(R.id.post_video_img);
    }

    @Override
    void setData(TimelineItem item) {

        PostVideoItem post = item.getPostVideoItem();
        tvTime.setText(post.getTime());
        Glide.with(super.itemView.getContext()).load(post.getUserImg()).into(imgUser);


    }
}
