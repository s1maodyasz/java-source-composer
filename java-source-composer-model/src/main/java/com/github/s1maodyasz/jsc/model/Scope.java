package com.github.s1maodyasz.jsc.model;

import java.util.LinkedList;
import java.util.List;

// This is a scope of a statement or statement block
public interface Scope extends StatementDef {

    final class Inline implements Scope {
        private final ElementDef element;

        public Inline(ElementDef element) {
            this.element = element;
        }

        public ElementDef getElement() {
            return element;
        }
    }

    final class Block implements Scope {
        private final List<ElementDef> elements;

        public Block() {
            this.elements = new LinkedList<>();
        }

        public Block(List<ElementDef> elements) {
            this.elements = elements;
        }
    }

    static Scope inline(ElementDef element) {
        return new Inline(element);
    }

    static Scope block() {
        return new Block();
    }
}
