package com.github.s1maodyasz.jsc.model;

public abstract class ObjectTypeDef implements TypeDef {

    private final String name;
    private final String source;

    public ObjectTypeDef(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }
}
