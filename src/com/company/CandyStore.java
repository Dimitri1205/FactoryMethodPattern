package com.company;

public class CandyStore {

    private static final CandyFactory chocolateFactory = new ChocolateFactory();
    private static final CandyFactory hardCandyFactory = new HardCandyFactory();

    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(7, "dark");
        chocolateFactory.getCandyPackage(8, "milk");

        hardCandyFactory.getCandyPackage(20, "lollipop");
        hardCandyFactory.getCandyPackage(11, "peppermint");


    }
}
