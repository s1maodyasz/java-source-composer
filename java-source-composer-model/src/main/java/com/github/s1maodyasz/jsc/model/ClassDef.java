package com.github.s1maodyasz.jsc.model;

import java.lang.reflect.Modifier;
import java.util.List;

public final class ClassDef {

    private final String packageName;
    private final List<AnnotationUsage> annotations;
    private final List<Modifier> modifiers;
    private final String className;
    private final JavaDoc docs;
    private final List<TypeDef.TypeVariable> typeParameters;
    private final List<VariableDef> fields;
    private final List<MethodDef> methods;
    private final List<ConstructorDef> constructors;
    private final List<ClassDef> innerClasses;

    public ClassDef(String packageName, List<AnnotationUsage> annotations, List<Modifier> modifiers, String className, JavaDoc docs, List<TypeDef.TypeVariable> typeParameters, List<VariableDef> fields, List<MethodDef> methods, List<ConstructorDef> constructors, List<ClassDef> innerClasses) {
        this.packageName = packageName;
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.className = className;
        this.docs = docs;
        this.typeParameters = typeParameters;
        this.fields = fields;
        this.methods = methods;
        this.constructors = constructors;
        this.innerClasses = innerClasses;
    }

    public String getPackageName() {
        return packageName;
    }

    public List<AnnotationUsage> getAnnotations() {
        return annotations;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public String getClassName() {
        return className;
    }

    public JavaDoc getDocs() {
        return docs;
    }

    public List<TypeDef.TypeVariable> getTypeParameters() {
        return typeParameters;
    }

    public List<VariableDef> getFields() {
        return fields;
    }

    public List<MethodDef> getMethods() {
        return methods;
    }

    public List<ConstructorDef> getConstructors() {
        return constructors;
    }

    public List<ClassDef> getInnerClasses() {
        return innerClasses;
    }
}
