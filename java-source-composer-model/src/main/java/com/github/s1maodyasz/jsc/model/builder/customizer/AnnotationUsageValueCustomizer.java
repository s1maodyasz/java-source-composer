package com.github.s1maodyasz.jsc.model.builder.customizer;

import com.github.s1maodyasz.jsc.model.AnnotationUsageValue;

public final class AnnotationUsageValueCustomizer {

	private String name;
	private Object value;

	private AnnotationUsageValueCustomizer() {}

	public static AnnotationUsageValueCustomizer builder() {
		return new AnnotationUsageValueCustomizer();
	}

	public AnnotationUsageValueCustomizer name(String name) {
		this.name = name;
		return this;
	}

	public AnnotationUsageValueCustomizer value(Object value) {
		this.value = value;
		return this;
	}

	public AnnotationUsageValue build() {
		return new AnnotationUsageValue(name, value);
	}
}
