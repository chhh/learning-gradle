package com.example;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        System.out.println(com.dmtavt.utils.TextUtils.someLibraryMethod());

        String name = "Dima";
        de.example.GermanHello hi = new de.example.GermanHello();
        System.out.println(hi.hello(name));
    }
}
