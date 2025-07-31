package com.github.s1maodyasz.jsc.model;

public final class AnnotationValueDef {

	private final String name;
	private final Object value;

	public AnnotationValueDef(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}
}
