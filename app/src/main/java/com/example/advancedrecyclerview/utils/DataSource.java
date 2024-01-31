package com.example.advancedrecyclerview.utils;

import com.example.advancedrecyclerview.model.HeaderTextItem;
import com.example.advancedrecyclerview.model.PostTextItem;
import com.example.advancedrecyclerview.model.TimelineItem;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<TimelineItem> getTimelineData() {
        List<TimelineItem> mData = new ArrayList<>();

//        create header item
        HeaderTextItem itemHeader = new HeaderTextItem("Yesterday");
        TimelineItem headerTimelineItem = new TimelineItem(itemHeader);
//        create post Item



    }
}
