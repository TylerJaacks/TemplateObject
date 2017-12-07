package com.tylerj.templatedobjects.examples;

import com.tylerj.templatedobjects.api.AccessModifierType;
import com.tylerj.templatedobjects.api.TemplatedField;
import com.tylerj.templatedobjects.api.TemplatedObject;

import java.util.HashMap;

public class SampleClass {
    public void Main() {
        TemplatedField<String> animalName = new TemplatedField<>(AccessModifierType.PUBLIC, "animalName");
        TemplatedObject animal = new TemplatedObject(animalName);

        animalName.toString();
    }
}
