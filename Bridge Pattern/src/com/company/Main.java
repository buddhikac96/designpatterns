package com.company;

public class Main {

    public static void main(String[] args) {
	    Book book = new Book(
	            "11 Minutes",
                "Pablo Image",
                "www.11minutes.com"
        );

	    Album album = new Album(
	            "Shakira Photo",
                "Waka Waka",
                "www.fifa2010.com"
        );

	    BookResource bookResource = new BookResource(book);
	    AlbumResource albumResource = new AlbumResource(album);

	    View bookView = new InfoView(bookResource);
        bookView.Show();

        bookView = new ThumbnailView(bookResource);
        bookView.Show();

        bookView = new ShortView(bookResource);
        bookView.Show();

	    View albumView = new InfoView(albumResource);
	    albumView.Show();

	    albumView = new ThumbnailView(albumResource);
	    albumView.Show();

	    albumView = new ShortView(albumResource);
	    albumView.Show();
    }
}

