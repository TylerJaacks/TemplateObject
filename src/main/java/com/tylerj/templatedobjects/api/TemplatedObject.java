package com.tylerj.templatedobjects.api;

import java.util.HashMap;

public class TemplatedObject {
    private String objectName;
    private HashMap<String, String[]> objectFields;

    public TemplatedObject(String objectName, HashMap<String, String[]> objectFields) {
        this.objectName = objectName;
        this.objectFields = objectFields;
    }

    public void forceTemplateGen() {

    }
}
