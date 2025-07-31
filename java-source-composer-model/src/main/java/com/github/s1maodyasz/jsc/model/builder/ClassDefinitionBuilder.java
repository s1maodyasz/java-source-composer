package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.*;
import com.github.s1maodyasz.jsc.model.builder.customizer.AnnotationUsageCustomizer;
import com.github.s1maodyasz.jsc.model.builder.customizer.JavaDocsDefinitionCustomizer;
import com.github.s1maodyasz.jsc.model.builder.customizer.TypeParameterCustomizer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import javax.lang.model.element.Modifier;

/** This class is the builder for a class definition */
public final class ClassDefinitionBuilder {

	private String packageName;
	private final List<AnnotationUsage> annotations = new LinkedList<>();
	private final List<Modifier> modifiers = new LinkedList<>();
	private String className;
	private JavaDocDef docs;
	private final List<TypeDef> typeParameters = new LinkedList<>();
	private final List<VariableDef> fields = new LinkedList<>();
	private final List<MethodDef> methods = new LinkedList<>();
	private final List<ConstructorDef> constructors = new LinkedList<>();
	private final List<ClassDef> innerClasses = new LinkedList<>();

	private ClassDefinitionBuilder() {}

	public static ClassDefinitionBuilder builder() {
		return new ClassDefinitionBuilder();
	}

	public ClassDefinitionBuilder packageName(final String packageName) {
		this.packageName = packageName;
		return this;
	}

	public ClassDefinitionBuilder addAnnotation(final Consumer<AnnotationUsageCustomizer> consumer) {
		final AnnotationUsageCustomizer customizer = AnnotationUsageCustomizer.builder();
		consumer.accept(customizer);
		final AnnotationUsage annotation = customizer.build();
		annotations.add(annotation);
		return this;
	}

	public ClassDefinitionBuilder modifiers(final Modifier... modifiers) {
		final List<Modifier> list = Arrays.asList(modifiers);
		this.modifiers.addAll(list);
		return this;
	}

	public ClassDefinitionBuilder className(final String className) {
		this.className = className;
		return this;
	}

	public ClassDefinitionBuilder docs(final Consumer<JavaDocsDefinitionCustomizer> consumer) {
		final JavaDocsDefinitionCustomizer customizer = JavaDocsDefinitionCustomizer.builder();
		consumer.accept(customizer);
		this.docs = customizer.build();
		return this;
	}

	public ClassDefinitionBuilder addTypeParameter(final Consumer<TypeParameterCustomizer> consumer) {
		final TypeParameterCustomizer customizer = TypeParameterCustomizer.builder();
		consumer.accept(customizer);
		final TypeDef typeParameter = customizer.build();
		typeParameters.add(typeParameter);
		return this;
	}

	public ClassDefinitionBuilder addField(final List<VariableDef> fields) {
		this.fields.addAll(fields);
		return this;
	}

	public ClassDefinitionBuilder methods(final List<MethodDef> methods) {
		this.methods.addAll(methods);
		return this;
	}

	public ClassDefinitionBuilder constructors(final List<ConstructorDef> constructors) {
		this.constructors.addAll(constructors);
		return this;
	}

	public ClassDefinitionBuilder innerClasses(final List<ClassDef> innerClasses) {
		this.innerClasses.addAll(innerClasses);
		return this;
	}

	public ClassDef build() {
		return new ClassDef(
				packageName,
				annotations,
				modifiers,
				className,
				docs,
				typeParameters,
				fields,
				methods,
				constructors,
				innerClasses);
	}
}
