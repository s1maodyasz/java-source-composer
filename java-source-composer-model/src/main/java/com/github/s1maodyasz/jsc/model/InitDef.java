package com.github.s1maodyasz.jsc.model;

import java.lang.reflect.Modifier;
import java.util.List;

public abstract class InitDef {

	protected final Scope scope;

	public InitDef(Scope scope) {
		this.scope = scope;
	}

	public Scope getScope() {
		return scope;
	}

	// Static initializer
	public static final class Static extends InitDef {
		public Static(Scope scope) {
			super(scope);
		}
	}

	public static final class Constructor extends InitDef {
		private final Modifier modifier;
		private final List<AnnotationUsage> annotations;
		private final List<StatementDef.Variable> parameters;

		public Constructor(
				Scope scope,
				Modifier modifier,
				List<AnnotationUsage> annotations,
				List<StatementDef.Variable> parameters) {
			super(scope);
			this.modifier = modifier;
			this.annotations = annotations;
			this.parameters = parameters;
		}

		public Modifier getModifier() {
			return modifier;
		}

		public List<AnnotationUsage> getAnnotations() {
			return annotations;
		}

		public List<StatementDef.Variable> getParameters() {
			return parameters;
		}
	}
}
