package com.example.recyclerbinding;

import com.google.gson.annotations.SerializedName;

public class Book {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("author")
    private String author;

    @SerializedName("description")
    private String description;

    @SerializedName("published")
    private String published;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }
}
