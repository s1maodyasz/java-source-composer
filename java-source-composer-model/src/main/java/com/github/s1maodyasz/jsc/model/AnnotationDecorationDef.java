package com.github.s1maodyasz.jsc.model;

import java.util.Map;

/** This class represents a usage of an annotation in a class definition for example. */
public final class AnnotationDecorationDef implements Def {

	private final ClassName className;
	private final Map<String, Object> values;

	public AnnotationDecorationDef(ClassName className, Map<String, Object> values) {
		this.className = className;
		this.values = values;
	}

	public ClassName className() {
		return className;
	}

	public Map<String, Object> values() {
		return values;
	}
}
