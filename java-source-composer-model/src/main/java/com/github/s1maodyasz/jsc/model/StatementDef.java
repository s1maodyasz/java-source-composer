package com.github.s1maodyasz.jsc.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface StatementDef extends ElementDef {

    final class Assignment implements StatementDef {
        final ExpressionDef left;
        final ExpressionDef right;

        public Assignment(ExpressionDef left, ExpressionDef right) {
            this.left = left;
            this.right = right;
        }
    }

    final class Call implements StatementDef {
        final ExpressionDef target;
        final List<ExpressionDef> arguments;

        public Call(ExpressionDef target, List<ExpressionDef> arguments) {
            this.target = target;
            this.arguments = arguments;
        }
    }

    class If implements StatementDef {
        final ExpressionDef condition;
        final Scope then;
        final Scope otherwise;

        public If(ExpressionDef condition, Scope then, Scope otherwise) {
            this.condition = condition;
            this.then = then;
            this.otherwise = otherwise;
        }
    }

    final class IfElse extends If {
        final Map<ExpressionDef, Scope> cases;

        public IfElse(ExpressionDef condition, Scope then, Scope otherwise, Map<ExpressionDef, Scope> cases) {
            super(condition, then, otherwise);
            this.cases = cases;
        }
    }
}
