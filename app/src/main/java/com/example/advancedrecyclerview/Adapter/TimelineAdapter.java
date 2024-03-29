package com.example.advancedrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedrecyclerview.R;
import com.example.advancedrecyclerview.model.TimelineItem;
import com.example.advancedrecyclerview.utils.Constant;

import java.util.List;

public class TimelineAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    private Context mContext;
    private List<TimelineItem> mdata;

    public TimelineAdapter(Context mContext, List<TimelineItem> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        switch (viewType){
            case (Constant.ITEM_HEADER_TEXT_VIEWTYPE):
                view = LayoutInflater.from(mContext).inflate(R.layout.item_header,parent, false);
                return new HeaderTextViewHolder(view);
            case (Constant.ITEM_POST_TEXT_VIEWTYPE):
                view = LayoutInflater.from(mContext).inflate(R.layout.item_post_text, parent,false);
                return new PostTextViewHolder(view);
            case (Constant.ITEM_POST_VIDEO_VIEWTYPE):
                view = LayoutInflater.from(mContext).inflate(R.layout.item_post_video,parent,false);
                return new PostVideoViewHolder(view);

            default:
                try {
                    throw new IllegalAccessException();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }

    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.setData(mdata.get(position));
    }


    @Override
    public int getItemViewType(int position) {
        return mdata.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        if (mdata!=null){
            return mdata.size();
        }
        else return 0;
    }
}
