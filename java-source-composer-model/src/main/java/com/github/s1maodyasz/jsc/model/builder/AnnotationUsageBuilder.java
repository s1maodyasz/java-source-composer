package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.AnnotationUsage;
import com.github.s1maodyasz.jsc.model.ClassName;

import java.util.HashMap;
import java.util.Map;

public class AnnotationUsageBuilder {

    private ClassName className;
    private final Map<String, Object> values = new HashMap<>();

    private AnnotationUsageBuilder() {}

    public AnnotationUsageBuilder name(ClassName className) {
        this.className = className;
        return this;
    }

    public AnnotationUsageBuilder value(String key, Object value) {
        this.values.put(key, value);
        return this;
    }

    public AnnotationUsage build() {
        return new AnnotationUsage(className, values);
    }
}
