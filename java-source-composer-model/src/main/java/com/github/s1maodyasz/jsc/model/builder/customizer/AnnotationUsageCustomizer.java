package com.github.s1maodyasz.jsc.model.builder.customizer;

import com.github.s1maodyasz.jsc.model.AnnotationUsage;
import com.github.s1maodyasz.jsc.model.AnnotationUsageValue;
import com.github.s1maodyasz.jsc.model.ClassName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class AnnotationUsageCustomizer {

	private ClassName reference;
	private final List<AnnotationUsageValue> values = new ArrayList<>();

	private AnnotationUsageCustomizer() {}

	public static AnnotationUsageCustomizer builder() {
		return new AnnotationUsageCustomizer();
	}

	public AnnotationUsageCustomizer reference(ClassName reference) {
		this.reference = reference;
		return this;
	}

	public AnnotationUsageCustomizer addValue(Consumer<AnnotationUsageValueCustomizer> consumer) {
		final AnnotationUsageValueCustomizer customizer = AnnotationUsageValueCustomizer.builder();
		consumer.accept(customizer);
		final AnnotationUsageValue value = customizer.build();
		values.add(value);
		return this;
	}

	public AnnotationUsage build() {
		return new AnnotationUsage(reference, values);
	}
}
