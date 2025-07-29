package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.List;

public class FieldDef extends VariableDef {

    public FieldDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, String name) {
        super(modifiers, annotations, type, name);
    }
}
