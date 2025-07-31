package com.github.s1maodyasz.jsc.model.builder.customizer;

import com.github.s1maodyasz.jsc.model.TypeDef;
import java.util.LinkedList;
import java.util.List;

public final class TypeParameterCustomizer {

	private String name;
	private final List<TypeDef> bounds = new LinkedList<>();

	private TypeParameterCustomizer() {}

	public static TypeParameterCustomizer builder() {
		return new TypeParameterCustomizer();
	}

	public TypeParameterCustomizer name(String name) {
		this.name = name;
		return this;
	}

	public TypeParameterCustomizer addBound(TypeDef bound) {
		bounds.add(bound);
		return this;
	}

	public TypeDef build() {
		return TypeDef.typeVariable(name, bounds);
	}
}
