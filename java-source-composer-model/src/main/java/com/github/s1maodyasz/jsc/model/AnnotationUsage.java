package com.github.s1maodyasz.jsc.model;

import java.util.Map;

/** This class represents a usage of an annotation. */
public final class AnnotationUsage {

	private final ClassName className;
	private final Map<String, Object> values;

	public AnnotationUsage(ClassName className, Map<String, Object> values) {
		this.className = className;
		this.values = values;
	}

	public ClassName getClassName() {
		return className;
	}

	public Map<String, Object> getValues() {
		return values;
	}
}
