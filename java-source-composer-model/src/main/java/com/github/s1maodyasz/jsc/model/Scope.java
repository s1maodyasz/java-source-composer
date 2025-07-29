package com.github.s1maodyasz.jsc.model;

import java.util.ArrayList;
import java.util.List;

public interface Scope {

    final class Inline implements Scope {
        private final ElementDef element;

        public Inline(ElementDef element) {
            this.element = element;
        }
    }

    final class Block implements Scope {
        private final List<StatementDef> statements;

        public Block() {
            this.statements = new ArrayList<>();
        }

        public Block(List<StatementDef> statements) {
            this.statements = statements;
        }
    }

    static Scope inline(ElementDef element) {
        return new Inline(element);
    }

    static Scope block() {
        return new Block();
    }

    static Scope block(List<StatementDef> statements) {
        return new Block(statements);
    }
}
