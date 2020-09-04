package com.company;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Invoker invoker = new Invoker(
                lightOnCommand,
                lightOffCommand
        );

        invoker.PressOn();
        invoker.PressUndoOn();
        invoker.PressOff();
        invoker.PressUndoOff();
    }
}

