package com.github.s1maodyasz.jsc.model;

public interface StatementDef extends ElementDef {

    final class Assignment implements StatementDef {
        private final VariableDef left;
        private final ElementDef right;

        public Assignment(VariableDef left, ElementDef right) {
            this.left = left;
            this.right = right;
        }

        public VariableDef getLeft() {
            return left;
        }

        public ElementDef getRight() {
            return right;
        }
    }

    final class While implements StatementDef {

        private final boolean doFirst;
        private final ExpressionDef condition;
        private final Scope scope;

        public While(boolean doFirst, ExpressionDef condition, Scope scope) {
            this.doFirst = doFirst;
            this.condition = condition;
            this.scope = scope;
        }

        public boolean isDoFirst() {
            return doFirst;
        }

        public ExpressionDef getCondition() {
            return condition;
        }

        public Scope getScope() {
            return scope;
        }
    }

    /**
     * This probably should be changed if we want to support more recent versions of java
     */
    final class Return implements StatementDef {
        final ExpressionDef expression;

        public Return(ExpressionDef expression) {
            this.expression = expression;
        }

        public ExpressionDef getExpression() {
            return expression;
        }
    }

    // TODO, add Try Catch models
}
