package com.company;

public class Album{
    public String photo;
    public String heading;
    public String uri;

    public Album(String photo, String heading, String uri) {
        this.photo = photo;
        this.heading = heading;
        this.uri = uri;
    }

    public String getPhoto() {
        return photo;
    }

    public String getHeading() {
        return heading;
    }

    public String getUri() {
        return uri;
    }
}


