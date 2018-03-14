package com.ushulabubko645.design.proxy;

public class MainTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("Test_image_01");

        image.display();
        System.out.println("");

        image.display();

    }


}
