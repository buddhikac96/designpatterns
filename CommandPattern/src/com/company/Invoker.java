package com.company;

public class Invoker {
    public ICommand onButton;
    public ICommand offButton;

    public Invoker(ICommand onButton, ICommand offButton) {
        this.onButton = onButton;
        this.offButton = offButton;
    }

    public void PressOn(){
        this.onButton.execute();
    }

    public void PressUndoOn(){
        this.onButton.undo();
    }

    public void PressOff(){
        this.offButton.execute();
    }

    public void PressUndoOff(){
        this.offButton.undo();
    }
}

