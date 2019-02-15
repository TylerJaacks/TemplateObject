package com.tylerj.templatedobjects.api;

import com.google.common.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;

/**
 * TemplatedField is a template for a field to added to a TemplateObject.
 * @param <T> Defines the type for the field.
 */
public class TemplatedField<T> {
    private AccessModifierType accessModifierType;
    private String type;
    private String name;
    private T value;

    /**
     * Constructs a TemplatedField given an AccessModifiedType and name.
     * @param accessModifierType Defines the access modifier for the field.
     * @param name Defines the name for the field.
     */
    public TemplatedField(AccessModifierType accessModifierType, String name) {
        this.accessModifierType = accessModifierType;
        this.name = name;
        this.value = null;
    }

    /**
     * Constructs a TemplatedField given an AccessModifiedType, name, and value.
     * @param accessModifierType
     * @param name
     * @param value
     */
    public TemplatedField(AccessModifierType accessModifierType, String name, T value) {
        this.accessModifierType = accessModifierType;
        this.name = name;
        this.value = value;
    }

    /**
     * Generates the code representation of the field.
     * @return the code representation of the field.
     * @return the code representation of the field.
     */
    @Override
    public String toString() {
        if (value == null) {
            return accessModifierType.toString().toLowerCase() + " " + type.getClass() + " " + name + " = null;";
        } else {
            return accessModifierType.toString().toLowerCase() + " " + type.getClass() + " " + name + " = " + value + ";";
        }
    }
}