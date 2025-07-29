package com.github.s1maodyasz.jsc.model;

import java.util.List;

public final class SwitchCaseStatementDef {

    private final List<ExpressionDef> values;
    private final Scope scope;

    public SwitchCaseStatementDef(final List<ExpressionDef> values, final Scope scope) {
        this.values = values;
        this.scope = scope;
    }
}
