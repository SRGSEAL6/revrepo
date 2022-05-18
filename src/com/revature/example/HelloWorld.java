package com.revature.example;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            args[i] = args[i] + "hello";
            System.out.println(args[i]);
        }
    }
}
