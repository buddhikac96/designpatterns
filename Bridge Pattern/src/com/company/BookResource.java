package com.company;

public class BookResource implements IResource{

    private Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        return this.book.getTopic();
    }

    @Override
    public String getImge() {
        return this.book.getPicture();
    }

    @Override
    public String getUrl() {
        return this.book.getLink();
    }
}
