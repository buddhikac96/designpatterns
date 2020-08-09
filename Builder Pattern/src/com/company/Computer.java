package com.company;

public class Computer{
    public String Cpu;
    public String Ram;
    public String Storage;

    public Computer(String cpu, String ram, String storage) {
        Cpu = cpu;
        Ram = ram;
        Storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Cpu='" + Cpu + '\'' +
                ", Ram='" + Ram + '\'' +
                ", Storage='" + Storage + '\'' +
                '}';
    }
}

