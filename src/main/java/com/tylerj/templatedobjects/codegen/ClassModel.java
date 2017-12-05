package com.tylerj.templatedobjects.codegen;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassModel {
    private ArrayList<String> fieldAcessorType = new ArrayList<>();
    private ArrayList<String> fieldType = new ArrayList<>();
    private ArrayList<String> fieldName = new ArrayList<>();

    public ClassModel(ArrayList<String> accessorType, ArrayList<String> type, ArrayList<String> name) {
        this.fieldAcessorType = accessorType;
        this.fieldType = type;
        this.fieldName = name;
    }

    public ArrayList<String> getFieldAcessorType() {
        return fieldAcessorType;
    }

    public ArrayList<String> getFieldName() {
        return fieldName;
    }

    public ArrayList<String> getFieldType() {
        return fieldType;
    }
}
