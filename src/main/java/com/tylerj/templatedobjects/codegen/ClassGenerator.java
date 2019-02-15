package com.tylerj.templatedobjects.codegen;

import com.tylerj.templatedobjects.api.TemplatedObject;

/**
 * Generates a Java class for a TemplatedObject.
 */
public class ClassGenerator {
    public static String templatedObjectToString(TemplatedObject templatedObject) {
        String className = templatedObject.getClass().getSimpleName();

        return className;
    }
}
