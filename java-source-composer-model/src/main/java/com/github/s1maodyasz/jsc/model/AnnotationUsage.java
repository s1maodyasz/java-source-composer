package com.github.s1maodyasz.jsc.model;

import java.util.Map;

/**
 * This class represents a usage of an annotation.
 */
public final class AnnotationUsage {

    final ClassRef ref;
    final Map<String, Object> values;

    public AnnotationUsage(ClassRef ref, Map<String, Object> values) {
        this.ref = ref;
        this.values = values;
    }

    public ClassRef getRef() {
        return ref;
    }

    public Map<String, Object> getValues() {
        return values;
    }
}
