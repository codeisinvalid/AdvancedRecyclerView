package com.example.advancedrecyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.advancedrecyclerview.Adapter.TimelineAdapter;
import com.example.advancedrecyclerview.R;
import com.example.advancedrecyclerview.model.TimelineItem;
import com.example.advancedrecyclerview.utils.Constant;
import com.example.advancedrecyclerview.utils.DataSource;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView timelineRv;
    private TimelineAdapter adapter;
    private List<TimelineItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniRV();
        getListData();


    }

    private void getListData() {
        mData = DataSource.getTimelineData();
    }

    private void iniRV() {

        timelineRv = findViewById(R.id.timeline_rv);
        timelineRv.setLayoutManager(new LinearLayoutManager(this));



    }
}