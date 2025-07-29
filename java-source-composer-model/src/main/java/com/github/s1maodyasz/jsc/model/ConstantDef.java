package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.List;

public final class ConstantDef extends FieldDef {

    private static final List<Modifier> CONSTANT_MODIFIERS = Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);

    public ConstantDef(List<AnnotationUsage> annotations, TypeDef type, String name) {
        super(CONSTANT_MODIFIERS, annotations, type, name);
    }
}
