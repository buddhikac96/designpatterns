package com.company;

public class Main {

    public static void main(String[] args) {

        // Create a builder instance instead creating Computer instance first
        ComputerBuilder builder = new ComputerBuilder();

        // Then build a Computer instance using Computer Builder
        Computer myPc = builder.setCpu("i7").setRam("8GB").setStorage("2TB").Build();

        System.out.println(myPc.toString());
    }
}

