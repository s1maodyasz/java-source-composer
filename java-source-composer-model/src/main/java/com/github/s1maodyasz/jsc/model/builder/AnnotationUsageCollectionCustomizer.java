package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.AnnotationUsage;

import java.util.List;

public final class AnnotationUsageCollectionCustomize {

    private List<AnnotationUsage> list;

    public AnnotationUsageCollectionCustomize(List<AnnotationUsage> list) {
        this.list = list;
    }

    public void add(AnnotationUsage annotationUsage) {
        list.add(annotationUsage);
    }
}
