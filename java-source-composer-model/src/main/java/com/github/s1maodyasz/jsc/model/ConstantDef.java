package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.List;

public final class ConstantDef extends VariableDef {

    private static final List<Modifier> MODIFIERS = Arrays.asList(Modifier.STATIC, Modifier.FINAL);

    public ConstantDef(List<AnnotationUsage> annotations, TypeDef type, String name) {
        super(MODIFIERS, annotations, type, name);
    }
}
