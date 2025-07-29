package com.github.s1maodyasz.jsc.model;

public class IfStatementDef implements StatementDef {

    private final ExpressionDef condition;
    private final Scope then;
    private final Scope otherwise;

    public IfStatementDef(ExpressionDef condition, Scope then, Scope otherwise) {
        this.condition = condition;
        this.then = then;
        this.otherwise = otherwise;
    }

    public ExpressionDef getCondition() {
        return condition;
    }

    public Scope getThen() {
        return then;
    }

    public Scope getOtherwise() {
        return otherwise;
    }
}
