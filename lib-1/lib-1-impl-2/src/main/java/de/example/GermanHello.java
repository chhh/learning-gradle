package de.example;

public class GermanHello implements com.example.api.ILib1Methods {
    @Override
    public String hello(String name) {
        return "Guten tag " + name;
    }

    @Override
    public String getLanguage() {
        return "German";
    }
}
