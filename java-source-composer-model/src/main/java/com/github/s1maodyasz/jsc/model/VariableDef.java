package com.github.s1maodyasz.jsc.model;

import java.util.List;
import javax.lang.model.element.Modifier;

public abstract class VariableDef {

	private final String name;
	private final TypeDef type;
    private final List<Modifier> modifiers;
	private final Object object;

    public VariableDef(String name, TypeDef type, List<Modifier> modifiers, Object object) {
        this.name = name;
        this.type = type;
        this.modifiers = modifiers;
        this.object = object;
    }

    public String name() {
		return name;
	}

	public TypeDef type() {
		return type;
	}

    public List<Modifier> modifiers() {
        return modifiers;
    }

    public Object object() {
		return object;
	}

    public static final class Field extends VariableDef {
        private final List<AnnotationDecorationDef> annotations;

        public Field(String name, TypeDef type, List<Modifier> modifiers, Object object, List<AnnotationDecorationDef> annotations) {
            super(name, type, modifiers, object);
            this.annotations = annotations;
        }

        public List<AnnotationDecorationDef> annotations() {
            return annotations;
        }
    }

    public static final class Parameter extends VariableDef {
        private final List<AnnotationDecorationDef> annotations;

        public Parameter(String name, TypeDef type, List<Modifier> modifiers, Object object, List<AnnotationDecorationDef> annotations) {
            super(name, type, modifiers, object);
            this.annotations = annotations;
        }

        public List<AnnotationDecorationDef> annotations() {
            return annotations;
        }
    }

    public static final class Local extends VariableDef {
        private final List<AnnotationDecorationDef> annotations;

        public Local(String name, TypeDef type, List<Modifier> modifiers, Object object, List<AnnotationDecorationDef> annotations) {
            super(name, type, modifiers, object);
            this.annotations = annotations;
        }

        public List<AnnotationDecorationDef> annotations() {
            return annotations;
        }
    }

    public static final class Catch extends VariableDef {
        public Catch(String name, TypeDef type, List<Modifier> modifiers, Object object) {
            super(name, type, modifiers, object);
        }
    }

    public static final class Constant extends VariableDef {
        public Constant(String name, TypeDef type, List<Modifier> modifiers, Object object) {
            super(name, type, modifiers, object);
        }
    }
}
