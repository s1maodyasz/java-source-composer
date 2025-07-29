package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.List;

public final class ParameterDef extends VariableDef {

    public ParameterDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, String name) {
        super(modifiers, annotations, type, name);
    }
}
