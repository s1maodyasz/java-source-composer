package com.github.s1maodyasz.jsc.model;

import java.util.List;

public interface ExpressionDef extends ElementDef {

    final class Literal implements ExpressionDef {
        private final Object value;

        public Literal(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }

    final class IfTernary implements ExpressionDef {
        private final ExpressionDef condition;
        private final ExpressionDef then;
        private final ExpressionDef otherwise;

        public IfTernary(ExpressionDef condition, ExpressionDef then, ExpressionDef otherwise) {
            this.condition = condition;
            this.then = then;
            this.otherwise = otherwise;
        }

        public ExpressionDef getCondition() {
            return condition;
        }

        public ExpressionDef getThen() {
            return then;
        }

        public ExpressionDef getOtherwise() {
            return otherwise;
        }
    }

    final class Cast implements ExpressionDef {
        private final ExpressionDef expression;
        private final TypeDef type;

        public Cast(ExpressionDef expression, TypeDef type) {
            this.expression = expression;
            this.type = type;
        }
        public ExpressionDef getExpression() {
            return expression;
        }
        public TypeDef getType() {
            return type;
        }
    }

    final class InstanceOf implements ExpressionDef {
        private final ExpressionDef expression;
        private final ClassRef type;

        public InstanceOf(ExpressionDef expression, ClassRef type) {
            this.expression = expression;
            this.type = type;
        }

        public ExpressionDef getExpression() {
            return expression;
        }

        public ClassRef getType() {
            return type;
        }
    }

    final class New implements ExpressionDef {
        private final ClassRef type;
        private final List<ExpressionDef> arguments;

        public New(ClassRef type, List<ExpressionDef> arguments) {
            this.type = type;
            this.arguments = arguments;
        }

        public ClassRef getType() {
            return type;
        }

        public List<ExpressionDef> getArguments() {
            return arguments;
        }
    }

    final class Assignment implements ExpressionDef {
        private final VariableDef left;
        private final ExpressionDef right;

        public Assignment(VariableDef left, ExpressionDef right) {
            this.left = left;
            this.right = right;
        }

        public VariableDef getLeft() {
            return left;
        }

        public ExpressionDef getRight() {
            return right;
        }
    }

    final class Increment implements ExpressionDef {
        private final VariableDef variable;
        private final boolean postfix;

        public Increment(VariableDef variable, boolean postfix) {
            this.variable = variable;
            this.postfix = postfix;
        }

        public VariableDef getVariable() {
            return variable;
        }

        public boolean isPostfix() {
            return postfix;
        }
    }

    final class Decrement implements ExpressionDef {
        private final VariableDef variable;
        private final boolean postfix;

        public Decrement(VariableDef variable, boolean postfix) {
            this.variable = variable;
            this.postfix = postfix;
        }

        public VariableDef getVariable() {
            return variable;
        }

        public boolean isPostfix() {
            return postfix;
        }
    }

    final class IsNull implements ExpressionDef {
        private final ExpressionDef expression;

        public IsNull(ExpressionDef expression) {
            this.expression = expression;
        }

        public ExpressionDef getExpression() {
            return expression;
        }
    }

    final class IsNotNull implements ExpressionDef {
        private final ExpressionDef expression;

        public IsNotNull(ExpressionDef expression) {
            this.expression = expression;
        }

        public ExpressionDef getExpression() {
            return expression;
        }
    }
}
