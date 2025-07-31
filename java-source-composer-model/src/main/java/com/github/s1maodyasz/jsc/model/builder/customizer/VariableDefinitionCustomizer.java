package com.github.s1maodyasz.jsc.model.builder.customizer;

import com.github.s1maodyasz.jsc.model.AnnotationUsage;
import com.github.s1maodyasz.jsc.model.TypeDef;
import com.github.s1maodyasz.jsc.model.VariableDeclarationScope;
import com.github.s1maodyasz.jsc.model.VariableDef;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

// TODO: Improvement please
public abstract class VariableDefinitionCustomizer {

    private final List<Modifier> modifiers = new LinkedList<>();
    private final List<AnnotationUsage> annotations = new LinkedList<>();
    private TypeDef type;
    private VariableDeclarationScope scope;
    private Object object;

    private VariableDefinitionCustomizer() {}

    public VariableDefinitionCustomizer modifiers(final Modifier... modifiers) {
        final List<Modifier> list = Arrays.asList(modifiers);
        this.modifiers.addAll(list);
        return this;
    }

    public VariableDefinitionCustomizer addAnnotation(final Consumer<AnnotationUsageCustomizer> consumer) {
        final AnnotationUsageCustomizer customizer = AnnotationUsageCustomizer.builder();
        consumer.accept(customizer);
        final AnnotationUsage annotation = customizer.build();
        annotations.add(annotation);
        return this;
    }

    public VariableDefinitionCustomizer type(TypeDef type) {
        this.type = type;
        return this;
    }

    public VariableDefinitionCustomizer scope(VariableDeclarationScope scope) {
        this.scope = scope;
        return this;
    }

    public VariableDefinitionCustomizer object(Object object) {
        this.object = object;
        return this;
    }

    final class Simple extends VariableDefinitionCustomizer {
        private String name;

        public Simple() {
        }

        public Simple name(String name) {
            this.name = name;
            return this;
        }

        public VariableDef build() {
            return new VariableDef.Simple(modifiers, annotations, type, scope, object, name);
        }

        public String getName() {
            return name;
        }
    }

    final class Multiple extends VariableDefinitionCustomizer {
        private List<String> labels;

        public Multiple() {
        }

        public Multiple labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        public VariableDef build() {
            return new VariableDef.Multiple(modifiers, annotations, type, scope, object, labels);
        }
    }
}
