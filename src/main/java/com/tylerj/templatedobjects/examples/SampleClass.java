package com.tylerj.templatedobjects.examples;

import com.tylerj.templatedobjects.api.TemplatedObject;

import java.util.HashMap;

public class SampleClass {
    HashMap<String, String[]> fields = new HashMap<>();
    String[] fieldType = {"public", "String"};
    TemplatedObject animal = new TemplatedObject("Animal", fields);

    public void Main() {
        fields.put("name", fieldType);
    }
}
