package com.github.s1maodyasz.jsc.model;

/**
 * Used in {@link StatementDef.IfElse} and {@link StatementDef.Switch} for representing decision
 * statements
 */
public final class DecisionStatementDef implements Def {

	private final ExpressionDef condition;
	private final Scope scope;

	public DecisionStatementDef(ExpressionDef condition, Scope scope) {
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
