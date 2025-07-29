package com.github.s1maodyasz.jsc.model;

import java.util.LinkedHashMap;
import java.util.Map;

public final class IfElseStatementDef extends IfStatementDef {

    private final Map<ExpressionDef, Scope> cases;

    public IfElseStatementDef(ExpressionDef condition, Scope then, Scope otherwise) {
        super(condition, then, otherwise);
        this.cases = new LinkedHashMap<>();
    }

    public Map<ExpressionDef, Scope> getCases() {
        return cases;
    }
}
