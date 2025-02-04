package com.company.designpattern.builderpattern;
//builder pattern
public class Phone {
    private String os;
    private int ram;
    private String company;
    private double screenSize;
    private int battery;

    public Phone(String os, int ram, String company, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.company = company;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", company='" + company + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
