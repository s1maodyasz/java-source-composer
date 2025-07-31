package com.github.s1maodyasz.jsc.model;

import java.lang.reflect.Modifier;
import java.util.List;

public final class ConstructorDef implements Def {

	private final List<Modifier> modifiers;
	private final List<AnnotationUsage> annotations;
	private final List<VariableDef> parameters;
	private final JavaDoc docs;
	private final Scope scope;

	public ConstructorDef(
			List<Modifier> modifiers,
			List<AnnotationUsage> annotations,
			List<VariableDef> parameters,
			JavaDoc docs,
			Scope scope) {
		this.modifiers = modifiers;
		this.annotations = annotations;
		this.parameters = parameters;
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

	public JavaDoc getDocs() {
		return docs;
	}

	public Scope getScope() {
		return scope;
	}
}
