package com.company;

public class ThumbnailView extends View{

    public ThumbnailView(IResource resource) {
        super(resource);
    }

    @Override
    public void Show() {
        System.out.println("=== Thumbnail View ===");
        System.out.println(
            "title - " + this.resource.getTitle() + "\n" +
            "image - " + this.resource.getImge()
        );
    }
}
