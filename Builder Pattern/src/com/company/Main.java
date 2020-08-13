package com.company;

public class Main {

    public static void main(String[] args) {
	    ComputerBuilder computerBuilder = new ComputerBuilder();
	    Computer myLaptop = computerBuilder.setCPU("i7").setHd("2TB").setRAM("4GB").Build();

        System.out.println(myLaptop.toString());
    }
}

