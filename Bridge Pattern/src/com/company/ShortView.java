package com.company;

public class ShortView extends View{

    public ShortView(IResource resource) {
        super(resource);
    }

    @Override
    public void Show() {
        System.out.println("=== Short View ===");
        System.out.println(
            "title - " + this.resource.getTitle()
        );
    }
}
