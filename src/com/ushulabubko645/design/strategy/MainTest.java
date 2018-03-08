package com.ushulabubko645.design.strategy;

public class MainTest {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 7 = " + context.executeStrategy(10,7));

        context = new Context(new OperationSuptract());
        System.out.println("10 - 7 = " + context.executeStrategy(10,7));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 7 = " + context.executeStrategy(10,7));


    }
}
