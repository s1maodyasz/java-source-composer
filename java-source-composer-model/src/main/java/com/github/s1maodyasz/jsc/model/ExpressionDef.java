package com.github.s1maodyasz.jsc.model;

public interface ExpressionDef extends ElementDef {

    final class Assignment implements ExpressionDef {
        final ExpressionDef left;
        final ExpressionDef right;

        public Assignment(ExpressionDef left, ExpressionDef right) {
            this.left = left;
            this.right = right;
        }
    }
}
