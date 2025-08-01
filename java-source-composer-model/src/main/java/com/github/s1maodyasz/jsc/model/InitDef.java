package com.github.s1maodyasz.jsc.model;

import java.util.List;
import javax.lang.model.element.Modifier;

public abstract class InitDef extends MethodDef {

	protected final CodeBlock codeBlock;

	public InitDef(
			List<Modifier> modifiers,
			TypeDef returnType,
			String name,
			CommentDef docs,
			CodeBlock codeBlock) {
		super(modifiers, returnType, name, docs);
		this.codeBlock = codeBlock;
	}

	public CodeBlock codeBlock() {
		return codeBlock;
	}

	public static final class Static extends InitDef {
		public Static(
				List<Modifier> modifiers,
				TypeDef returnType,
				String name,
				CommentDef docs,
				CodeBlock codeBlock) {
			super(modifiers, returnType, name, docs, codeBlock);
		}
	}

	public static final class Constructor extends InitDef {
		private final List<AnnotationDecorationDef> annotations;
		private final List<VariableDef> parameters;

		public Constructor(
				List<Modifier> modifiers,
				List<AnnotationDecorationDef> annotations,
				List<VariableDef> parameters,
				TypeDef returnType,
				String name,
				CommentDef docs,
				CodeBlock codeBlock) {
			super(modifiers, returnType, name, docs, codeBlock);
			this.annotations = annotations;
			this.parameters = parameters;
		}

		public List<AnnotationDecorationDef> annotations() {
			return annotations;
		}

		public List<VariableDef> parameters() {
			return parameters;
		}
	}
}
