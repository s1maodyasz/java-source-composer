package com.github.s1maodyasz.jsc.model;

public final class SwitchCaseStatementDef {

    private final ExpressionDef condition;
    private final Scope scope;

    public SwitchCaseStatementDef(ExpressionDef condition, Scope scope) {
        this.condition = condition;
        this.scope = scope;
    }

    public ExpressionDef getCondition() {
        return condition;
    }

    public Scope getScope() {
        return scope;
    }
}
