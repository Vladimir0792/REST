package com.demoTravis;

import com.sun.tools.javac.Main;

public class Travis {
    public static void travis(Object o) {
    }

    public boolean isInt (int a, int b) {
        return a > b;
    }

    public static void main(String[] args) {
        System.out.println("Successfully");

        Travis travis = new Travis();
        System.out.println(travis.isInt(40, 33));
    }
}
