package com.tylerj.templatedobjects.api;

/**
 * TemplatedField is a template for a field to added to a TemplateObject.
 * @param <T> Defines the type for the field.
 */
public class TemplatedField<T> {
    private AccessModifierType accessModifierType;
    private T type;
    private String name;

    /**
     * Constructs a TemplatedField given an AccessModifiedType and name.
     * @param accessModifierType Defines the access modifier for the field.
     * @param name Defines the name for the field.
     */
    public TemplatedField(AccessModifierType accessModifierType, String name) {
        this.accessModifierType = accessModifierType;
        this.name = name;
    }

    /**
     * Generates the code representation of the field.
     * @return the code representation of the field.
     * @return the code representation of the field.
     */
    @Override
    public String toString() {
        return new String(accessModifierType.toString().toLowerCase() + " " + type.getClass() + " " + name);
    }
}