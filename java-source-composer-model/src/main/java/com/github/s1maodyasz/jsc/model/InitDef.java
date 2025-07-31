package com.github.s1maodyasz.jsc.model;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;

public abstract class InitDef {

    protected final Scope scope;

    public InitDef(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }

    static final class Static extends InitDef {
        public Static(Scope scope) {
            super(scope);
        }
    }

    static final class Constructor extends InitDef {
        final Modifier modifier;
        final List<AnnotationUsage> annotations;
        final List<VariableDef> parameters;

        public Constructor(Scope scope, Modifier modifier, List<AnnotationUsage> annotations, List<VariableDef> parameters) {
            super(scope);
            this.modifier = modifier;
            this.annotations = Collections.unmodifiableList(annotations);
            this.parameters = Collections.unmodifiableList(parameters);
        }

        public Modifier getModifier() {
            return modifier;
        }

        public List<AnnotationUsage> getAnnotations() {
            return annotations;
        }

        public List<VariableDef> getParameters() {
            return parameters;
        }
    }
}
