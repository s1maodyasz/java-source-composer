package com.github.s1maodyasz.jsc.model;

import java.util.List;

public final class SwitchStatementDef implements StatementDef {

    private final ExpressionDef expression;
    private final List<SwitchCaseStatementDef> cases;

    public SwitchStatementDef(ExpressionDef expression, List<SwitchCaseStatementDef> cases) {
        this.expression = expression;
        this.cases = cases;
    }
}
