package com.company;

public class InfoView extends View{

    public InfoView(IResource resource) {
        super(resource);
    }

    @Override
    public void Show() {
        System.out.println("=== Info View ===");
        System.out.println(
            "title - " + this.resource.getTitle() + "\n" +
            "image - " + this.resource.getImge() + "\n" +
            "url - " + this.resource.getUrl()
        );
    }
}
