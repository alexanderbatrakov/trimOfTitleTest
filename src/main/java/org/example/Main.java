package org.example;


import java.util.InputMismatchException;

import static org.example.ShorteningOfTitle.shorteningOfTitle;

public class Main {
    public static void main(String[] args) {
        try {
            String title = System.getProperty("title", "Volvo released a new car with the following spec: V6 236HP. It will cost $22647 and going to be sold in New York");
            int len = Integer.parseInt(System.getProperty("len", "25"));
            System.out.println(shorteningOfTitle(title, len));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number in the \"Title length\" field");
        } catch (Throwable e) {
            System.out.println("Something went wrong");
        }
    }
}