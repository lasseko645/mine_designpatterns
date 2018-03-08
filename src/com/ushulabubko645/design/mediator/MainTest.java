package com.ushulabubko645.design.mediator;

public class MainTest {
    public static void main(String[] args) {
        User lasse = new User("Lasse");
        User johan = new User("Johan");

        lasse.sendMessage("det er sku mig !?!?!?!");
        johan.sendMessage("det er sku ikke mig !?!?!?!");
    }
}
