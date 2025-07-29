package com.github.s1maodyasz.jsc.model;

public final class AnnotationValueDef {

    private final TypeDef type;
    private final String name;
    private final Object standard;

    public AnnotationValueDef(TypeDef type, String name, Object standard) {
        this.type = type;
        this.name = name;
        this.standard = standard;
    }

    public TypeDef getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Object getStandard() {
        return standard;
    }
}
