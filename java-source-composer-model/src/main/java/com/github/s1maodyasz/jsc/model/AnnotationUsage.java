package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

/**
 * This class represents a usage of an annotation.
 */
public abstract class AnnotationUsage {

    private final ClassRef reference;
    private final List<AnnotationValueDef> values;

    public AnnotationUsage(ClassRef reference, List<AnnotationValueDef> values) {
        this.reference = reference;
        this.values = Collections.unmodifiableList(values);
    }

    public ClassRef getReference() {
        return reference;
    }

    public List<AnnotationValueDef> getValues() {
        return values;
    }
}
