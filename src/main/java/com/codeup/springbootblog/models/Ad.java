package com.codeup.springbootblog.models;

public class Ad {
    private long id;
    private String title;
    private String description;

    public Ad(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setId(long id){
        this.id = id;
    }
}
