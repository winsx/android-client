package com.shixian.android.client.model.feeddate;

import com.shixian.android.client.model.Comment;
import com.shixian.android.client.model.User;

import java.util.List;

/**
 * Created by s0ng on 2015/2/10.
 */
public class BaseFeedItem {

    public User user;
    public Project project;
    public List<Comment> comments;
    public String create_at;


}
