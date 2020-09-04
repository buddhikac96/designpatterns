package com.company;

public class LightOnCommand implements ICommand {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOn();
    }

    @Override
    public void undo() {
        this.light.lightOff();
    }
}

