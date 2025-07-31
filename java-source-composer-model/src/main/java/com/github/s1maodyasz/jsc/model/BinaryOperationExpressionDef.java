package com.github.s1maodyasz.jsc.model;

public abstract class BinaryOperationExpressionDef implements ExpressionDef {

    private final ExpressionDef left;
    private final ExpressionDef right;

    public BinaryOperationExpressionDef(ExpressionDef left, ExpressionDef right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionDef getLeft() {
        return left;
    }

    public ExpressionDef getRight() {
        return right;
    }

    public static final class Add extends BinaryOperationExpressionDef {
        public Add(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class Subtract extends BinaryOperationExpressionDef {
        public Subtract(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class Multiply extends BinaryOperationExpressionDef {
        public Multiply(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class Divide extends BinaryOperationExpressionDef {
        public Divide(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class Remainder extends BinaryOperationExpressionDef {
        public Remainder(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class Equals extends BinaryOperationExpressionDef {
        public Equals(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class NotEquals extends BinaryOperationExpressionDef {
        public NotEquals(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class LessThen extends BinaryOperationExpressionDef {
        public LessThen(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class GreaterThen extends BinaryOperationExpressionDef {
        public GreaterThen(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class LessEquals extends BinaryOperationExpressionDef {
        public LessEquals(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class GreaterEquals extends BinaryOperationExpressionDef {
        public GreaterEquals(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class And extends BinaryOperationExpressionDef {
        public And(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }

    public static final class Or extends BinaryOperationExpressionDef {
        public Or(ExpressionDef left, ExpressionDef right) { super(left, right); }
    }
}