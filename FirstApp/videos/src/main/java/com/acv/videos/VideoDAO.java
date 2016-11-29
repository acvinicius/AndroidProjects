package com.acv.videos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinicius.castro on 10/17/2016.
 */

public class VideoDAO {

    public List<Video> listar () {
        List<Video> videoList = new ArrayList<Video>();
        videoList.add(new Video(1, "Narcos", 50));
        videoList.add(new Video(2, "Luke Cage", 300));
        return videoList;
    }

}
