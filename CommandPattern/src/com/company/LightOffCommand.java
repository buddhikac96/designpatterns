package com.company;

public class LightOffCommand implements ICommand {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOff();
    }

    @Override
    public void undo() {
        this.light.lightOn();
    }
}
