package com.example.advancedrecyclerview.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.advancedrecyclerview.R;
import com.example.advancedrecyclerview.model.PostTextItem;
import com.example.advancedrecyclerview.model.TimelineItem;

public class PostTextViewHolder extends BaseViewHolder{

    private TextView tvPost, tvTime;
    private ImageView imgUser;

    public PostTextViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPost = itemView.findViewById(R.id.post_text_context);
        tvTime = itemView.findViewById(R.id.post_video_time);
        imgUser = itemView.findViewById(R.id.post_text_img);
    }

    @Override
    void setData(TimelineItem item) {
        PostTextItem post = item.getPostTextItem();
        tvPost.setText(post.getPostText());
        tvTime.setText(post.getTime());
        Glide.with(itemView.getContext()).load(post.getImgUser()).into(imgUser);


    }
}
