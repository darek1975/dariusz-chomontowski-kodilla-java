package com.kodilla.stream.com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("test do upiększenia",a -> a.toUpperCase());
        poemBeautifier.beautify("test do upiększenia",a -> "ABC"+a+"ABC");
        poemBeautifier.beautify("test do upiększenia",a -> a.replace("e", "E"));
        poemBeautifier.beautify("test do upiększenia",a -> a.replace(" ", "_"));

            }
}
