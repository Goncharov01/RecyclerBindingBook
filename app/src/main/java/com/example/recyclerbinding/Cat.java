package com.example.recyclerbinding;

public class Cat {

    int id;
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Cat.name = name;
    }
}
