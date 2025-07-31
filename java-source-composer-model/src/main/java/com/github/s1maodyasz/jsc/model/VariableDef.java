package com.github.s1maodyasz.jsc.model;

import javax.lang.model.element.Modifier;
import java.util.List;

public abstract class VariableDef implements StatementDef {

    private final List<Modifier> modifiers;
    private final List<AnnotationUsage> annotations;
    private final TypeDef type;
    private final VariableDeclarationScope scope;

    public VariableDef(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, VariableDeclarationScope scope) {
        this.modifiers = modifiers;
        this.annotations = annotations;
        this.type = type;
        this.scope = scope;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public List<AnnotationUsage> getAnnotations() {
        return annotations;
    }

    public TypeDef getType() {
        return type;
    }

    public VariableDeclarationScope getScope() {
        return scope;
    }

    static final class Simple extends VariableDef {
        private final String name;

        public Simple(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, VariableDeclarationScope scope, String name) {
            super(modifiers, annotations, type, scope);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static final class Multiple extends VariableDef {
        private final List<String> labels;

        public Multiple(List<Modifier> modifiers, List<AnnotationUsage> annotations, TypeDef type, VariableDeclarationScope scope, List<String> labels) {
            super(modifiers, annotations, type, scope);
            this.labels = labels;
        }

        public List<String> getLabels() {
            return labels;
        }
    }
}
