package com.adikshit;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(20, true);
	    int tonerLevel = printer.fillToner(30);
        System.out.println("Toner level is " + tonerLevel);
        printer.printPages(100);
    }
}
