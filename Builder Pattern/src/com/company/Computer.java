package com.company;

public class Computer{
    public String CPU;
    public String RAM;
    public String Hd;

    public Computer(String CPU, String RAM, String hd) {
        this.CPU = CPU;
        this.RAM = RAM;
        Hd = hd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Hd='" + Hd + '\'' +
                '}';
    }
}

