package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;
import javax.lang.model.element.Modifier;

public abstract class MethodDef implements Def {

	private final List<Modifier> modifiers;
	private final TypeDef returnType;
	private final String name;
	private final CommentDef docs;

	public MethodDef(List<Modifier> modifiers, TypeDef returnType, String name, CommentDef docs) {
		this.modifiers = Collections.unmodifiableList(modifiers);
		this.returnType = returnType;
		this.name = name;
		this.docs = docs;
	}

	public List<Modifier> modifiers() {
		return modifiers;
	}

	public TypeDef returnType() {
		return returnType;
	}

	public String name() {
		return name;
	}

	public CommentDef docs() {
		return docs;
	}

    public static final class Abstract extends MethodDef {
        public Abstract(List<Modifier> modifiers, TypeDef returnType, String name, CommentDef docs) {
            super(modifiers, returnType, name, docs);
        }
    }

    // Interface method
    public static final class Interface extends MethodDef {
        public Interface(List<Modifier> modifiers, TypeDef returnType, String name, CommentDef docs) {
            super(modifiers, returnType, name, docs);
        }
    }

    public static final class Standard extends MethodDef {
        private final CodeBlock codeBlock;

        public Standard(List<Modifier> modifiers, TypeDef returnType, String name, CommentDef docs, CodeBlock codeBlock) {
            super(modifiers, returnType, name, docs);
            this.codeBlock = codeBlock;
        }

        public CodeBlock codeBlock() {
            return codeBlock;
        }
    }
}
