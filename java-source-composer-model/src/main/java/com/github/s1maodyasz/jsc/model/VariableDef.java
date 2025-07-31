package com.github.s1maodyasz.jsc.model;

import java.util.List;
import javax.lang.model.element.Modifier;

public abstract class VariableDef implements StatementDef {

	private final List<Modifier> modifiers;
	private final List<AnnotationUsage> annotations;
	private final TypeDef type;
	private final VariableDeclarationScope scope;
	private final Object object; // Can be null

	public VariableDef(
			List<Modifier> modifiers,
			List<AnnotationUsage> annotations,
			TypeDef type,
			VariableDeclarationScope scope,
			Object object) {
		this.modifiers = modifiers;
		this.annotations = annotations;
		this.type = type;
		this.scope = scope;
		this.object = object;
	}

	public List<Modifier> getModifiers() {
		return modifiers;
	}

	public List<AnnotationUsage> getAnnotations() {
		return annotations;
	}

	public TypeDef getType() {
		return type;
	}

	public VariableDeclarationScope getScope() {
		return scope;
	}

	public Object getObject() {
		return object;
	}

	static final class Simple extends VariableDef {
		private final String name;

		public Simple(
				List<Modifier> modifiers,
				List<AnnotationUsage> annotations,
				TypeDef type,
				VariableDeclarationScope scope,
				Object object,
				String name) {
			super(modifiers, annotations, type, scope, object);
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	static final class Multiple extends VariableDef {
		private final List<String> labels;

		public Multiple(
				List<Modifier> modifiers,
				List<AnnotationUsage> annotations,
				TypeDef type,
				VariableDeclarationScope scope,
				Object object,
				List<String> labels) {
			super(modifiers, annotations, type, scope, object);
			this.labels = labels;
		}

		public List<String> getLabels() {
			return labels;
		}
	}
}
