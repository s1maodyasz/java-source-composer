package com.github.s1maodyasz.jsc.model;

import java.util.LinkedList;
import java.util.List;

public final class SwitchStatementDef implements StatementDef {

    private final ExpressionDef condition;
    private final List<SwitchCaseStatementDef> cases;

    public SwitchStatementDef(ExpressionDef condition) {
        this.condition = condition;
        this.cases = new LinkedList<>();
    }

    public ExpressionDef getCondition() {
        return condition;
    }

    public List<SwitchCaseStatementDef> getCases() {
        return cases;
    }
}
