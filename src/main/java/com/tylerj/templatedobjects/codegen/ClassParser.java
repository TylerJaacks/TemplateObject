package com.tylerj.templatedobjects.codegen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ClassParser parses Java classes and finds TemplatedObject code
 * and creates a model of the projected class.
 */
public class ClassParser {
    private static BufferedReader bufferedReader;

    /**
     * Parses a given Java file and finds the TemplatedObject call.
     *
     * @param filePath path to a given Java file to be parsed.
     * @return a ClassModel representing the TemplatedObject.
     */
    protected static ClassModel parseClass(String filePath) {
        try {
            BufferedReader bufferedReader = bufferedReader = new BufferedReader(new FileReader(filePath));


        } catch (FileNotFoundException e) {
            System.out.println("File could not be found check to make sure the file exists.");
        }

        return null;
    }
}
