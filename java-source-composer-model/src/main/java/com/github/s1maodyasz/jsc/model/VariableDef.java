package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.List;

public abstract class VariableDef implements StatementDef {

    private final List<Modifier> modifiers;
    private final List<AnnotationUsage> annotations;
    private final TypeDef type;
    private final String name;

    public VariableDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, String name) {
        this.modifiers = modifiers;
        this.annotations = annotations;
        this.type = type;
        this.name = name;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public List<AnnotationUsage> getAnnotations() {
        return annotations;
    }

    public TypeDef getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
