package com.github.s1maodyasz.jsc.model;

import java.util.List;
import javax.lang.model.element.Modifier;

public abstract class ClassDef implements Def {

	private final String packageName;
    private final String className;
	private final List<AnnotationDecorationDef> annotations;
	private final List<Modifier> modifiers;
	private final CommentDef docs;
	private final List<VariableDef> variables;
	private final List<MethodDef> methods;
	private final List<ClassDef> innerClasses;

    public ClassDef(String packageName, String className, List<AnnotationDecorationDef> annotations, List<Modifier> modifiers, CommentDef docs, List<VariableDef> variables, List<MethodDef> methods, List<ClassDef> innerClasses) {
        this.packageName = packageName;
        this.className = className;
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.docs = docs;
        this.variables = variables;
        this.methods = methods;
        this.innerClasses = innerClasses;
    }

    public String packageName() {
        return packageName;
    }

    public String className() {
        return className;
    }

    public List<AnnotationDecorationDef> annotations() {
        return annotations;
    }

    public List<Modifier> modifiers() {
        return modifiers;
    }

    public CommentDef docs() {
        return docs;
    }

    public List<VariableDef> variables() {
        return variables;
    }

    public List<MethodDef> methods() {
        return methods;
    }

    public List<ClassDef> innerClasses() {
        return innerClasses;
    }

    public static final class Interface {}

	public static final class Abstract {}
}
