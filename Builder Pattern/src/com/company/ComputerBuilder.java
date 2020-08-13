package com.company;

public class ComputerBuilder{
    public String CPU;
    public String RAM;
    public String Hd;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setHd(String hd) {
        Hd = hd;
        return this;
    }

    public Computer Build(){
        return new Computer(this.CPU, this.RAM, this.Hd);
    }
}
