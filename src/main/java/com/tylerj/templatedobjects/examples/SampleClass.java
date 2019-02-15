package com.tylerj.templatedobjects.examples;

import com.tylerj.templatedobjects.api.AccessModifierType;
import com.tylerj.templatedobjects.api.TemplatedField;
import com.tylerj.templatedobjects.api.TemplatedFunction;
import com.tylerj.templatedobjects.api.TemplatedObject;
import com.tylerj.templatedobjects.codegen.ClassGenerator;

import java.util.ArrayList;

public class SampleClass {
    public static void main(String[] args) {
        ArrayList<TemplatedField> fieldList = new ArrayList<>();
        ArrayList<TemplatedFunction> functionList = new ArrayList<>();

        TemplatedField<String> animalName = new TemplatedField<>(AccessModifierType.PUBLIC, "animalName");
        TemplatedField<Integer> animalAge = new TemplatedField<>(AccessModifierType.PUBLIC, "animalAge", 12);

        TemplatedFunction getAnimalName = new TemplatedFunction();
        TemplatedFunction setAnimalName = new TemplatedFunction();

        fieldList.add(animalName);
        fieldList.add(animalAge);

        TemplatedObject animal = new TemplatedObject(fieldList, functionList);



        String content = ClassGenerator.templatedObjectToString(animal);

        System.out.println("Test");
    }
}
