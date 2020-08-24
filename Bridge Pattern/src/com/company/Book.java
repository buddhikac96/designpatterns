package com.company;

public class Book{
    public String topic;
    public String picture;
    public String link;

    public Book(String topic, String picture, String link) {
        this.topic = topic;
        this.picture = picture;
        this.link = link;
    }

    public String getTopic() {
        return topic;
    }

    public String getPicture() {
        return picture;
    }

    public String getLink() {
        return link;
    }
}

