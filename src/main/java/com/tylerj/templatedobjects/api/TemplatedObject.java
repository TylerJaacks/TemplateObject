package com.tylerj.templatedobjects.api;

import java.util.ArrayList;

/**
 * TemplatedObject is a template for a Object to be created at build time.
 */
public class TemplatedObject {
    private ArrayList<TemplatedField> fields = new ArrayList<>();
    private ArrayList<TemplatedFunction> functions = new ArrayList<TemplatedFunction>();

    /**
     * Constructs a TemplatedObject from just an ArrayList of TemplatedFields.
     * @param fields ArrayList of fields for the TemplatedObject.
     */
    public TemplatedObject(ArrayList<TemplatedField> fields) {
        this.fields = fields;
    }

    /**
     * Constructs a TemplatedObject from just an ArrayList of TemplatedFields and TemplatedFunctions.
     * @param fields ArrayList of fields for the TemplatedObject.
     * @param functions ArrayList of functions for the TemplatedObject.
     */
    public TemplatedObject(ArrayList<TemplatedField> fields, ArrayList<TemplatedFunction> functions) {
        this.fields = fields;
        this.functions = functions;
    }
}