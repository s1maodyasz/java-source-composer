package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

/** This class represents a usage of an annotation. */
public class AnnotationUsage {

	private final ClassName reference;
	private final List<AnnotationUsageValue> values;

	public AnnotationUsage(ClassName reference, List<AnnotationUsageValue> values) {
		this.reference = reference;
		this.values = Collections.unmodifiableList(values);
	}

	public ClassName getReference() {
		return reference;
	}

	public List<AnnotationUsageValue> getValues() {
		return values;
	}
}
