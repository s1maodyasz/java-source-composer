package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.List;

public final class AnnotationDef implements Def {

    private final List<Modifier> modifiers;
    private final List<AnnotationUsage> annotations;
    private final String name;

    public AnnotationDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, String name) {
        this.modifiers = modifiers;
        this.annotations = annotations;
        this.name = name;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public List<AnnotationUsage> getAnnotations() {
        return annotations;
    }

    public String getName() {
        return name;
    }
}
