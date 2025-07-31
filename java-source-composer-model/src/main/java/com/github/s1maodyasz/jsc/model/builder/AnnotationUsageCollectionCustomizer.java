package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.AnnotationUsage;
import java.util.List;
import java.util.function.Consumer;

public final class AnnotationUsageCollectionCustomizer implements Customizable {

	private final List<AnnotationUsage> list;

	public AnnotationUsageCollectionCustomizer(List<AnnotationUsage> list) {
		this.list = list;
	}

	public AnnotationUsageCollectionCustomizer add(Consumer<AnnotationUsageBuilder> consumer) {
		final AnnotationUsageBuilder builder = new AnnotationUsageBuilder();
		consumer.accept(builder);
		final AnnotationUsage annotationUsage = builder.build();
		list.add(annotationUsage);
		return this;
	}

	public List<AnnotationUsage> customize() {
		return list;
	}
}
