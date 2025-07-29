package com.github.s1maodyasz.jsc.model;

import java.lang.reflect.Modifier;
import java.util.List;

public abstract class InitDef {

    protected final Scope scope;

    public InitDef(Scope scope) {
        this.scope = scope;
    }

    static final class Static extends InitDef {
        public Static(Scope scope) {
            super(scope);
        }
    }

    static final class Constructor extends InitDef {
        final Modifier modifier;
        final List<AnnotationUsage> annotations;
        final List<ParameterDef> parameters;

        public Constructor(Scope scope, Modifier modifier, List<AnnotationUsage> annotations, List<ParameterDef> parameters) {
            super(scope);
            this.modifier = modifier;
            this.annotations = annotations;
            this.parameters = parameters;
        }
    }
}
