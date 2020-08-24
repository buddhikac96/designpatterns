package com.company;

public class AlbumResource implements IResource{

    private Album album;

    public AlbumResource(Album album) {
        this.album = album;
    }

    @Override
    public String getTitle() {
        return this.album.getHeading();
    }

    @Override
    public String getImge() {

        return this.album.getPhoto();
    }

    @Override
    public String getUrl() {
        return this.album.getUri();
    }
}
