package com.tylerj.templatedobjects.codegen;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 2) {
            System.out.println("Please enter -x and a file or -y and a folder.");
        }

        if (args[0].equals("-x")) {

        } else if (args[0].equals("-y")) {

        } else {
            System.out.println("Please enter -x and a file or -y and a folder.");
        }
    }
}
