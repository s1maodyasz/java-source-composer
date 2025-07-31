package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.Collections;
import java.util.List;

public final class MethodDef implements Def {

    private final List<Modifier> modifiers;
    private final List<AnnotationUsage> annotations;
    private final List<VariableDef> parameters;
    private final TypeDef returnType;
    private final String name;
    private final JavaDoc docs;
    private final Scope scope;

    public MethodDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, List<VariableDef> parameters, TypeDef returnType, String name, JavaDoc docs, Scope scope) {
        this.modifiers = Collections.unmodifiableList(modifiers);
        this.annotations = Collections.unmodifiableList(annotations);
        this.parameters = Collections.unmodifiableList(parameters);
        this.returnType = returnType;
        this.name = name;
        this.docs = docs;
        this.scope = scope;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public List<AnnotationUsage> getAnnotations() {
        return annotations;
    }

    public List<VariableDef> getParameters() {
        return parameters;
    }

    public TypeDef getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public JavaDoc getDocs() {
        return docs;
    }

    public Scope getScope() {
        return scope;
    }
}
