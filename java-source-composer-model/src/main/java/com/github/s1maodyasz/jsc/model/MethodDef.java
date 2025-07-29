package com.github.s1maodyasz.jsc.model;

import java.lang.reflect.Modifier;
import java.util.List;

public final class MethodDef implements Def {

    private final List<Modifier> modifiers;
    private final List<AnnotationUsage> annotations;
    private final TypeDef product;
    private final String name;
    private final List<ParameterDef> parameters;
    private final JavaDoc docs;

    public MethodDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef product, String name, List<ParameterDef> parameters, JavaDoc docs) {
        this.modifiers = modifiers;
        this.annotations = annotations;
        this.product = product;
        this.name = name;
        this.parameters = parameters;
        this.docs = docs;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public List<AnnotationUsage> getAnnotations() {
        return annotations;
    }

    public TypeDef getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public List<ParameterDef> getParameters() {
        return parameters;
    }

    public JavaDoc getDocs() {
        return docs;
    }
}
