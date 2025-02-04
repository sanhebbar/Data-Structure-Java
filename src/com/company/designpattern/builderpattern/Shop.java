package com.company.designpattern.builderpattern;

public class Shop {
    public static void main(String[] args) {
        Phone p =new PhoneBuilder().setRam(2).setCompany("qualcom").getPhone();
        System.out.println(p);
    }
}
