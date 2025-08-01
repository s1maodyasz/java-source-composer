package com.github.s1maodyasz.jsc.model;

import java.util.LinkedList;
import java.util.List;

// This is a scope of a statement or statement block
public interface CodeBlock extends ElementDef {

	final class Inline implements CodeBlock {
		private final ElementDef element;

		public Inline(ElementDef element) {
			this.element = element;
		}

		public ElementDef getElement() {
			return element;
		}
	}

	final class Block implements CodeBlock {
		private final List<ElementDef> elements;

		public Block() {
			this.elements = new LinkedList<>();
		}

		public List<ElementDef> elements() {
			return elements;
		}
	}

	static CodeBlock inline(ElementDef element) {
		return new Inline(element);
	}

	static CodeBlock block() {
		return new Block();
	}
}
