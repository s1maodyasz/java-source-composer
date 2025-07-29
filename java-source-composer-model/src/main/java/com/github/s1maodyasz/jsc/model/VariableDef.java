package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.List;

// This can be a field or a parameter
public abstract class VariableDef implements Def {

    protected final List<Modifier> modifiers;
    protected final List<AnnotationUsage> annotations;
    protected final TypeDef type;
    protected final String name;

    public VariableDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, String name) {
        this.modifiers = modifiers;
        this.annotations = annotations;
        this.name = name;
        this.type = type;
    }
}
