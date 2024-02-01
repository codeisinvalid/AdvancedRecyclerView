package com.example.advancedrecyclerview.utils;

import com.example.advancedrecyclerview.R;
import com.example.advancedrecyclerview.model.HeaderTextItem;
import com.example.advancedrecyclerview.model.PostTextItem;
import com.example.advancedrecyclerview.model.PostVideoItem;
import com.example.advancedrecyclerview.model.TimelineItem;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<TimelineItem> getTimelineData() {
        List<TimelineItem> mData = new ArrayList<>();

//        create header item
        HeaderTextItem itemHeader = new HeaderTextItem("Yesterday");
        TimelineItem headerTimelineItem = new TimelineItem(itemHeader);
//        create post Item
        PostTextItem postTextItem = new PostTextItem("This is the single post text.",
                R.drawable.sooj,"10:15");
        TimelineItem posttextTimelineItem = new TimelineItem(postTextItem);

//        create post video item
        PostVideoItem postVideoItem = new PostVideoItem("This is the post video item", R.drawable.sooj,"9:14");
        TimelineItem postVideoTimelineItem = new TimelineItem(postVideoItem);

        mData.add(headerTimelineItem);
        mData.add(posttextTimelineItem);
        mData.add(postVideoTimelineItem);



        //        create header item
        HeaderTextItem itemHeader2 = new HeaderTextItem("Yesterday");
        TimelineItem headerTimelineItem2 = new TimelineItem(itemHeader2);
//        create post Item
        PostTextItem postTextItem2 = new PostTextItem("This is my first journey crested. With all your best wishes, I hope to make this journey memorable",
                R.drawable.sooj,"10:15");
        TimelineItem posttextTimelineItem2 = new TimelineItem(postTextItem2);

//        create post video item
        PostVideoItem postVideoItem2 = new PostVideoItem("This is the post video item", R.drawable.sooj,"9:14");
        TimelineItem postVideoTimelineItem2 = new TimelineItem(postVideoItem2);

        mData.add(headerTimelineItem2);
        mData.add(posttextTimelineItem2);
        mData.add(postVideoTimelineItem2);





//        create header item
        HeaderTextItem itemHeader3 = new HeaderTextItem("Today");
        TimelineItem headerTimelineItem3 = new TimelineItem(itemHeader3);
//        create post Item
        PostTextItem postTextItem3 = new PostTextItem("This is the single post text. This is also a simple dummy text used for the texts section in the " +
                "practice. There are various dummy texts like this. Some examples are Lorem ipsum",
                R.drawable.sooj,"10:15");
        TimelineItem posttextTimelineItem3 = new TimelineItem(postTextItem3);

//        create post video item
        PostVideoItem postVideoItem3 = new PostVideoItem("This is the post video item", R.drawable.sooj,"9:14");
        TimelineItem postVideoTimelineItem3 = new TimelineItem(postVideoItem3);

        mData.add(headerTimelineItem3);
        mData.add(posttextTimelineItem3);
        mData.add(postVideoTimelineItem3);

        return mData;




    }
}
