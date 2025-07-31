package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;
import javax.lang.model.element.Modifier;

// This is a marker for interface definitions
public interface Def {

	final class Method implements Def {

		private final List<Modifier> modifiers;
		private final List<AnnotationUsage> annotations;
		private final List<StatementDef.Variable> parameters;
		private final TypeDef returnType;
		private final String name;
		private final JavaDocDef docs;
		private final Scope scope;

		public Method(
				List<Modifier> modifiers,
				List<AnnotationUsage> annotations,
				List<StatementDef.Variable> parameters,
				TypeDef returnType,
				String name,
				JavaDocDef docs,
				Scope scope) {
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

		public List<StatementDef.Variable> getParameters() {
			return parameters;
		}

		public TypeDef getReturnType() {
			return returnType;
		}

		public String getName() {
			return name;
		}

		public JavaDocDef getDocs() {
			return docs;
		}

		public Scope getScope() {
			return scope;
		}
	}

	final class Class implements Def {

		private final String packageName;
		private final List<AnnotationUsage> annotations;
		private final List<Modifier> modifiers;
		private final String className;
		private final JavaDocDef docs;
		private final List<TypeDef> typeParameters;
		private final List<StatementDef.Variable> variables;
		private final List<Method> methods;
		private final InitDef.Static staticInitiator;
		private final List<InitDef.Constructor> constructors;
		private final List<Class> innerClasses;

		public Class(
				String packageName,
				List<AnnotationUsage> annotations,
				List<Modifier> modifiers,
				String className,
				JavaDocDef docs,
				List<TypeDef> typeParameters,
				List<StatementDef.Variable> variables,
				List<Method> methods,
				InitDef.Static staticInitiator,
				List<InitDef.Constructor> constructors,
				List<Class> innerClasses) {
			this.packageName = packageName;
			this.annotations = annotations;
			this.modifiers = modifiers;
			this.className = className;
			this.docs = docs;
			this.typeParameters = typeParameters;
			this.variables = variables;
			this.methods = methods;
			this.staticInitiator = staticInitiator;
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

		public JavaDocDef getDocs() {
			return docs;
		}

		public List<TypeDef> getTypeParameters() {
			return typeParameters;
		}

		public List<StatementDef.Variable> getVariables() {
			return variables;
		}

		public List<Method> getMethods() {
			return methods;
		}

		public InitDef.Static getStaticInitiator() {
			return staticInitiator;
		}

		public List<InitDef.Constructor> getConstructors() {
			return constructors;
		}

		public List<Class> getInnerClasses() {
			return innerClasses;
		}
	}
}
