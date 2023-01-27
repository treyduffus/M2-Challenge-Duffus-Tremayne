package com.company.chatterbook.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List<ChatterPost> Posts = new ArrayList<>();

    public User(String name){
        this.name = name;
    }

    public List<ChatterPost> getPosts() {
        return Posts;
    }

    public void setChatterPosts(List<ChatterPost> posts) {
        Posts = posts;
    }

    public String getName() {
        return this.name;
    }
}
