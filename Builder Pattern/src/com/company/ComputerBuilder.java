package com.company;

public class ComputerBuilder{
    public String Cpu;
    public String Ram;
    public String Storage;

    public ComputerBuilder setCpu(String cpu) {
        Cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        Ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        Storage = storage;
        return this;
    }

    public Computer Build(){
        return new Computer(this.Cpu, this.Ram, this.Storage);
    }
}
